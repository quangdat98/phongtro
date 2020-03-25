package com.quangdat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.quangdat.DB.connectionDB;
import com.quangdat.model.QuanTri;
import com.quangdat.model.khachhang;

public class AdminDao {
	connectionDB connection = new connectionDB();
	
	
	public  QuanTri KiemTra(String email,String pass) {
		
		
		Connection conn = connection.getConnection();	
		PreparedStatement pre= null;	
		String  query = " select * from nguoiquantri where Email =? and Pass =?";	

		ResultSet rs = null;
		QuanTri qt = new QuanTri();
		try {
			pre=conn.prepareStatement(query);
			pre.setString(1,email);
			pre.setString(2,pass);
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
	
	public  List<QuanTri> getList() {
		
		
		Connection conn = connection.getConnection();	
		PreparedStatement pre= null;	
		String  query = " select * from nguoiquantri";	
		List<QuanTri> listqt = new ArrayList<>();
		ResultSet rs = null;
		
		try {
			pre=conn.prepareStatement(query);
			rs=pre.executeQuery();
			while(rs.next()) {
					QuanTri qt = new QuanTri();
					qt.setMaqt(rs.getInt("MaQT"));
					qt.setHoten(rs.getString("HoTen"));
					qt.setDiachi(rs.getString("DiaChi"));
					qt.setSdt(rs.getString("SDT"));
					qt.setEmail(rs.getString("Email"));
					qt.setPass(rs.getString("Pass"));
					listqt.add(qt);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listqt;
	}
	
	
	//---------------------------xoa phong
	
	public boolean xoaphong(int id) {
		boolean check = false;
		Connection conn =connection.getConnection();
		
		PreparedStatement pre = null; 
		String query="delete from phong where MaPhong =?";
		
		try {
			pre=conn.prepareStatement(query);
			pre.setInt(1, id);
			int i = pre.executeUpdate();
			
			if(i>0) {
				check = true;
				System.out.println("da xoa dk");
			}else {
				System.out.println("xoa that bai");
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return check;	
	}
	
	//---------------------------------xoa khachhang
	
	public boolean xoakhachhang(int id) {
		boolean check = false;
		Connection conn =connection.getConnection();
		
		PreparedStatement pre = null; 
		String query="delete from khachhang where MaKH =?";
		
		try {
			pre=conn.prepareStatement(query);
			pre.setInt(1, id);
			int i = pre.executeUpdate();
			
			if(i>0) {
				check = true;
				System.out.println("da xoa dk");
			}else {
				System.out.println("xoa that bai");
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return check;	
	}
	
	public boolean xoaadmin(int id) {
		boolean check = false;
		Connection conn =connection.getConnection();
		
		PreparedStatement pre = null; 
		String query="delete from nguoiquantri where MaQT =?";
		
		try {
			pre=conn.prepareStatement(query);
			pre.setInt(1, id);
			int i = pre.executeUpdate();
			
			if(i>0) {
				check = true;
				System.out.println("da xoa dk");
			}else {
				System.out.println("xoa that bai");
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return check;	
	}
	
	//--------------------------------- xoa loai phong
	
	public boolean xoaloaiphong(int id) {
		boolean check = false;
		Connection conn =connection.getConnection();
		
		PreparedStatement pre = null; 
		String query="delete from loaiphong where MaLoaiPhong =?";
		
		try {
			pre=conn.prepareStatement(query);
			pre.setInt(1, id);
			int i = pre.executeUpdate();
			
			if(i>0) {
				check = true;
				System.out.println("da xoa dk");
			}else {
				System.out.println("xoa that bai");
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return check;	
	}
	
	//----------------------------------- xoa tin tuc
	
	public boolean xoatintuc(int id) {
		boolean check = false;
		Connection conn =connection.getConnection();
		
		PreparedStatement pre = null; 
		String query="delete from tintuc where MaTT =?";
		
		try {
			pre=conn.prepareStatement(query);
			pre.setInt(1, id);
			int i = pre.executeUpdate();
			
			if(i>0) {
				check = true;
				System.out.println("da xoa dk");
			}else {
				System.out.println("xoa that bai");
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return check;	
	}
	
	//------------------------------xoa dat phong
	
	public boolean xoaDatPhong(int id) {
		boolean check = false;
		Connection conn =connection.getConnection();
		
		PreparedStatement pre = null; 
		String query="delete from datphong where MaDP =?";
		
		try {
			pre=conn.prepareStatement(query);
			pre.setInt(1, id);
			int i = pre.executeUpdate();
			
			if(i>0) {
				check = true;
				System.out.println("da xoa dk");
			}else {
				System.out.println("xoa that bai");
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return check;	
	}
	
	
}
