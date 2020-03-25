package com.quangdat.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.quangdat.DB.connectionDB;
import com.quangdat.model.LoaiPhong;
import com.quangdat.model.PhongTro;
import com.quangdat.model.datphong;
import com.quangdat.model.khachhang;

public class DatPhongDao {
	connectionDB connectionDB = new connectionDB();
	
	docghifile docfile = new docghifile();
	
	
	public static Date layNgayHienTai() {
		long millis=System.currentTimeMillis();  
		java.sql.Date date=new java.sql.Date(millis);  
		return date;
	}
	
	
	public boolean getDatPhong(int makh, int maphong,int thoigian,String chitiet,String noidung) {
		boolean check = false;
		Connection conn = connectionDB.getConnection();
		
		float gia = 0;
		
		PreparedStatement pre = null;
		PreparedStatement pre2 = null;
		ResultSet rs =null;
		String query="insert into datphong(ThoiGian,ThoiGianTaoHD,MaKH,MaPhong,ChiTiet,NoiDung,TongTien) values(?,?,?,?,?,?,?)";
		String sql ="select Gia from phong where MaPhong="+maphong+"";
		try {
			pre2=conn.prepareStatement(sql);
			rs=pre2.executeQuery();
			while(rs.next()) {
				gia=rs.getFloat("Gia");
			}
			
			float tongtien=gia*thoigian;
			
			pre=conn.prepareStatement(query);
			
			pre.setInt(1, thoigian);
			pre.setDate(2, layNgayHienTai());
			pre.setInt(3, makh);
			pre.setInt(4,maphong);
			pre.setString(5, chitiet);
			pre.setString(6,noidung);
			
			pre.setFloat(7, tongtien);
			int i = pre.executeUpdate();
			if(i==0) {
				System.out.println("them that bai");
			}else {
				System.out.println("da dap phong thanh cong");
				check = true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return check;
	}
	
	
	
	public int getSoLuong(int id) {
		Connection conn=connectionDB.getConnection();
		int dem=0;
		PreparedStatement pre = null;
		
		String sql="SELECT COUNT (*)  FROM datphong where MaKH = ?";
		ResultSet rs = null;
		try {
			pre =conn.prepareStatement(sql);
			pre.setInt(1, id);
			rs=pre.executeQuery();
			while(rs.next()) {
				dem=rs.getInt(1);
				System.out.println(dem);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dem;
		
	}
	
	public datphong layGioHang(int id) {
		datphong datp = new datphong();
		StringBuilder bString = new StringBuilder();
		bString.append("select datphong.MaDP,datphong.ThoiGian,datphong.ChiTiet,phong.anh,datphong.NoiDung,datphong.TongTien,");
		bString.append(" khachhang.HoTen,phong.DiaChi");
		bString.append(" from datphong inner join khachhang on datphong.MaKH = khachhang.MaKH");
		bString.append(" inner join phong on phong.MaPhong = datphong.MaPhong where datphong.MaDP = ?");
		String query = bString.toString();
		Connection conn = null;
		
		PreparedStatement pre = null;
		
		
		
		conn=connectionDB.getConnection();
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			pre.setInt(1, id);
			
			rs=pre.executeQuery();
	
			while(rs.next()) {
				khachhang khang = new khachhang();			
				PhongTro ptro = new PhongTro();
				
				khang.setHoten(rs.getString("HoTen"));
				ptro.setDiachi(rs.getString("DiaChi"));
				ptro.setAnh(rs.getString("anh"));
				datp.setKhang(khang);
				datp.setPtro(ptro);
				datp.setChitiet(rs.getString("ChiTiet"));
				datp.setNoidung(rs.getString("NoiDung"));
				datp.setThoigian(rs.getInt("ThoiGian"));
				datp.setTongtien(rs.getFloat("TongTien"));
				datp.setMadp(rs.getInt("MaDp"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return datp;
	}
	
	//--------------------------list dt phong
	
	public List<datphong> laydanhsach(int id) {
		List<datphong> list= new ArrayList<datphong>();
		Connection conn = null;	
		PreparedStatement pre = null;	
		conn=connectionDB.getConnection();
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement("select TongTien,MaDP from datphong where MaKH = ?");
			pre.setInt(1, id);
			rs=pre.executeQuery();
	
			while(rs.next()) {
				datphong datp = new datphong();
				datp.setTongtien(rs.getFloat("TongTien"));	
				datp.setMadp(rs.getInt("MaDP"));
				list.add(datp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	
	public boolean suaDatPhong(String chitiet,String noidung,float tongtien,int thoigian,int madp) {
		boolean check = false;
		Connection conn = connectionDB.getConnection();	
		PreparedStatement pre= null;	
		String  query = " update datphong set ChiTiet=?,NoiDung=?,TongTien=?,ThoiGian=? where MaDP=?";	
		try {
			pre=conn.prepareStatement(query);
			pre.setString(1,chitiet);
			pre.setString(2,noidung);
			pre.setFloat(3,tongtien);
			pre.setInt(4, thoigian);
			pre.setInt(5, madp);
			int i =pre.executeUpdate();
			if(i == 0) {
				System.out.println("sua that bai");
			}else {
				System.out.println("sua thanh cong");
				check = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return check;
	}
	
	public  void ghihoadon(int id) {
		
		StringBuilder bString = new StringBuilder();
		bString.append("select datphong.MaDP,datphong.ThoiGian,datphong.ChiTiet,phong.anh,datphong.NoiDung,datphong.TongTien,");
		bString.append(" khachhang.HoTen,phong.DiaChi,phong.NguoiDang");
		bString.append(" from datphong inner join khachhang on datphong.MaKH = khachhang.MaKH");
		bString.append(" inner join phong on phong.MaPhong = datphong.MaPhong where datphong.MaDP = ?");
		String query = bString.toString();
		Connection conn = null;
		
		PreparedStatement pre = null;
			
		conn=connectionDB.getConnection();
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			
			pre.setInt(1, id);
			
			rs=pre.executeQuery();
			
			while(rs.next()) {
				
				docfile.docghifile(rs.getFloat("TongTien"), rs.getInt("ThoiGian"), rs.getString("ChiTiet"), rs.getString("NoiDung"), rs.getString("HoTen"), rs.getString("DiaChi"), rs.getString("NguoiDang"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new DatPhongDao().ghihoadon(8);
	}
	
	
}
