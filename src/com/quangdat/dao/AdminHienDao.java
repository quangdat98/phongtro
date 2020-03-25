package com.quangdat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.quangdat.DB.connectionDB;
import com.quangdat.model.LoaiPhong;
import com.quangdat.model.PhongTro;
import com.quangdat.model.QuanTri;
import com.quangdat.model.TinTuc;
import com.quangdat.model.datphong;
import com.quangdat.model.khachhang;

public class AdminHienDao {
	connectionDB connectionDB = new connectionDB();
	
	public  List<khachhang> getList() {
		//------------------ kh
		
		Connection conn = connectionDB.getConnection();	
		PreparedStatement pre= null;	
		String  query = " select * from khachhang";	
		List<khachhang> listkh = new ArrayList<>();
		ResultSet rs = null;
		
		try {
			pre=conn.prepareStatement(query);
			rs=pre.executeQuery();
			while(rs.next()) {
					khachhang kh = new khachhang();
					kh.setMakh(rs.getInt("MaKh"));
					kh.setHoten(rs.getString("HoTen"));
					kh.setSdt(rs.getString("SDT"));
					kh.setEmail(rs.getString("Email"));
					kh.setDiachi(rs.getString("DiaChi"));
					kh.setGhichu(rs.getString("GhiChu"));
					listkh.add(kh);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listkh;
	}
	
	public khachhang getKhById(int id) {
		khachhang kh = new khachhang();
		Connection conn = connectionDB.getConnection();	
		PreparedStatement pre= null;	
		String  query = " select * from khachhang where MaKH=?";	
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			pre.setInt(1,id);
			
			rs=pre.executeQuery();
			while(rs.next()) {
				kh.setMakh(rs.getInt("MaKh"));
				kh.setHoten(rs.getString("HoTen"));
				kh.setSdt(rs.getString("SDT"));
				kh.setEmail(rs.getString("Email"));
				kh.setDiachi(rs.getString("DiaChi"));
				kh.setGhichu(rs.getString("GhiChu"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return kh;
	}
	
	
	//-----------------------------phong
	
	public List<PhongTro> getListpPhong(){
		List<PhongTro> list = new ArrayList<>();
		Connection conn = null;
		Statement stm = null;
		String Query="select * from phong";
		ResultSet rs =null;
		
		conn=connectionDB.getConnection();
		try {
			stm=conn.createStatement();
			rs=stm.executeQuery(Query);
			while(rs.next()) {
				PhongTro phongTro = new PhongTro();
				phongTro.setAnh(rs.getString("anh"));
				phongTro.setGia(rs.getFloat("Gia"));
				phongTro.setMota(rs.getString("MoTa"));	
				phongTro.setMaphong(rs.getInt("MaPhong"));
				phongTro.setDiachi(rs.getString("DiaChi"));
				phongTro.setMaloaiphong(rs.getInt("MaLoaiPhong"));
				list.add(phongTro);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	// loai phong
	
	public LoaiPhong getLoaiPhong(int id) {
		Connection conn =connectionDB.getConnection();
		
		
		PreparedStatement pre= null;
	
		LoaiPhong lp  = new LoaiPhong();
		String query="select * from LoaiPhong where MaLoaiPhong =?";
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			pre.setInt(1, id);
			rs=pre.executeQuery();
			
			while(rs.next()) {
				
				lp.setTenloaiphong(rs.getString("TenLoaiPhong"));
				lp.setMaloaiphong(rs.getInt("MaLoaiPhong"));
				lp.setMota(rs.getString("MoTa"));
		
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lp;
		
	}
	
	//------------------------dat phong
	
	public List<datphong> getListDatPhong(){
		List<datphong> list = new ArrayList<>();
		Connection conn = null;
		Statement stm = null;
		String Query="select * from datphong";
		ResultSet rs =null;
		
		conn=connectionDB.getConnection();
		try {
			stm=conn.createStatement();
			rs=stm.executeQuery(Query);
			while(rs.next()) {
				datphong dp = new datphong();
				dp.setMadp(rs.getInt("MaDP"));
				dp.setTgtaohoadon(rs.getDate("ThoiGianTaoHD"));
				dp.setNoidung(rs.getString("NoiDung"));
				dp.setChitiet(rs.getString("ChiTiet"));
				dp.setThoigian(rs.getInt("ThoiGian"));
				dp.setTongtien(rs.getFloat("TongTien"));
				dp.setMakh(rs.getInt("MaKH"));
				dp.setMaphong(rs.getInt("MaPhong"));
				list.add(dp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public datphong layDatPhong(int id) {
		
		
		Connection conn = null;
		
		PreparedStatement pre = null;
		datphong dp = new datphong();	
		conn=connectionDB.getConnection();
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement("select * from datphong where MaDP =?");
			pre.setInt(1, id);
			
			rs=pre.executeQuery();
	
			while(rs.next()) {
					
				dp.setMadp(rs.getInt("MaDP"));
				dp.setTgtaohoadon(rs.getDate("ThoiGianTaoHD"));
				dp.setNoidung(rs.getString("NoiDung"));
				dp.setChitiet(rs.getString("ChiTiet"));
				dp.setThoigian(rs.getInt("ThoiGian"));
				dp.setTongtien(rs.getFloat("TongTien"));
				dp.setMakh(rs.getInt("MaKH"));
				dp.setMaphong(rs.getInt("MaPhong"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dp;
	}
	
}
