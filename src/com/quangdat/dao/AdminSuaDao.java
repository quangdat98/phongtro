package com.quangdat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.quangdat.DB.connectionDB;
import com.quangdat.model.LoaiPhong;
import com.quangdat.model.PhongTro;
import com.quangdat.model.QuanTri;
import com.quangdat.model.TinTuc;
import com.quangdat.model.khachhang;

public class AdminSuaDao {
	
	connectionDB connection = new connectionDB();
	
	//-------------------------------sua admin
	
	public boolean adminsua(QuanTri kh) {
		boolean check = false;
		Connection conn = connection.getConnection();	
		PreparedStatement pre= null;	
		String  query = " update nguoiquantri set HoTen=?,SDT=?,Email=?,DiaChi=?,Pass=? where MaQT=?";	
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			pre.setString(1,kh.getHoten());
			pre.setString(2,kh.getSdt());
			pre.setString(3,kh.getEmail());
			pre.setString(4,kh.getDiachi());
			pre.setString(5,kh.getPass());
			
			pre.setInt(6,kh.getMaqt());
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
	
	public QuanTri getAdminById(int id) {
		QuanTri qt =new QuanTri();
		Connection conn = connection.getConnection();	
		PreparedStatement pre= null;	
		String  query = " select * from nguoiquantri where MaQT=?";	
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			pre.setInt(1,id);
			
			rs=pre.executeQuery();
			while(rs.next()) {
				qt.setMaqt(rs.getInt("MaQT"));
				qt.setHoten(rs.getString("HoTen"));
				qt.setDiachi(rs.getString("DiaChi"));
				qt.setSdt(rs.getString("SDT"));
				qt.setEmail(rs.getString("Email"));
				qt.setPass(rs.getString("Pass"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return qt;
	}
	
	//---------------------------------sua khach hang
	
	public boolean adminsuakh(khachhang kh) {
		boolean check = false;
		Connection conn = connection.getConnection();	
		PreparedStatement pre= null;	
		String  query = " update khachhang set HoTen=?,SDT=?,Email=?,DiaChi=?,Pass=?,GhiChu=? where MaKH=?";	
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			pre.setString(1,kh.getHoten());
			pre.setString(2,kh.getSdt());
			pre.setString(3,kh.getEmail());
			pre.setString(4,kh.getDiachi());
			pre.setString(5,kh.getPass());
			pre.setString(6,kh.getGhichu());
			pre.setInt(7,kh.getMakh());
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
	
	
	
	//----------------------------------- sua tin tuc
	
	public boolean adminsuatintuc(TinTuc tt) {
		boolean check = false;
		Connection conn = connection.getConnection();	
		PreparedStatement pre= null;	
		String  query = " update tintuc set TieuDe=?,MoTa=?,NoiDung=?,NgayDang=?,MaQT=?,anh=? where MaTT=?";	
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			pre.setString(1,tt.getTieude());
			pre.setString(2,tt.getMota());
			pre.setString(3,tt.getNoidung());
			pre.setDate(4,DatPhongDao.layNgayHienTai());
			pre.setInt(5,tt.getMaqt());
			pre.setString(6,"resources/images/"+tt.getAnh());
			pre.setInt(7,tt.getMatt());
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
	
	
	// -------------------------------------sua phong
	
	public boolean adminsuaphong(PhongTro kh) {
		boolean check = false;
		Connection conn = connection.getConnection();	
		PreparedStatement pre= null;	
		String  query = " update phong set DiaChi=?,MoTa=?,DienTich=?,Gia=?,anh=?,MaLoaiPhong=? where MaPhong=?";	
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			pre.setString(1,kh.getDiachi());
			pre.setString(2,kh.getMota());
			pre.setString(3,kh.getDientich());
			
			pre.setFloat(4,kh.getGia());
			pre.setString(5,"resources/images/"+kh.getAnh());
			pre.setInt(6,kh.getMaloaiphong());
			pre.setInt(7, kh.getMaphong());
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
	
	//------------------------------------
	
	public boolean adminSuaLoai(LoaiPhong kh) {
		boolean check = false;
		Connection conn = connection.getConnection();	
		PreparedStatement pre= null;	
		String  query = " update loaiphong set TenLoaiPhong=?,MoTa=? where MaLoaiPhong=?";	
		try {
			pre=conn.prepareStatement(query);
			pre.setString(1,kh.getTenloaiphong());
			pre.setString(2,kh.getMota());
			pre.setInt(3, kh.getMaloaiphong());
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
	

	
	
}
