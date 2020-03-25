package com.quangdat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import com.quangdat.DB.connectionDB;
import com.quangdat.model.khachhang;

public class LoginDao {
	
	connectionDB connection = new connectionDB();
	int makhcb = 0;
	
	public  boolean KiemTra(String email,String pass) {
		boolean check = false;
		khachhang kh = new khachhang();
		Connection conn = connection.getConnection();	
		PreparedStatement pre= null;	
		String  query = " select * from khachhang where Email =? and Pass =?";	
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			pre.setString(1,email);
			pre.setString(2,pass);
			rs=pre.executeQuery();
			while(rs.next()) {
				check = true;
				makhcb = rs.getInt("MaKH");
				kh.setHoten(rs.getString("HoTen"));
				kh.setDiachi(rs.getString("DiaChi"));
				kh.setSdt(rs.getString("SDT"));
				kh.setGhichu(rs.getString("GhiChu"));
				kh.setPass(rs.getString("Pass"));
				kh.setEmail(rs.getString("Email"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public  khachhang getKhachHang(String email,String pass) {
		khachhang kh = new khachhang();
		Connection conn = connection.getConnection();	
		PreparedStatement pre= null;	
		String  query = " select * from khachhang where Email =? and Pass =?";	
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			pre.setString(1,email);
			pre.setString(2,pass);
			rs=pre.executeQuery();
			while(rs.next()) {
				kh.setMakh(rs.getInt("MaKH"));
				kh.setHoten(rs.getString("HoTen"));
				kh.setDiachi(rs.getString("DiaChi"));
				kh.setSdt(rs.getString("SDT"));
				kh.setGhichu(rs.getString("GhiChu"));
				kh.setPass(rs.getString("Pass"));
				kh.setEmail(rs.getString("Email"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kh;
	}
	
	//----------------------------- the moi 
	
	public boolean themmo(khachhang kh) {
		boolean check = false;
		Connection conn = connection.getConnection();	
		PreparedStatement pre= null;	
		String  query = " insert into khachhang(HoTen,SDT,Email,DiaChi,Pass,GhiChu) values(?,?,?,?,?,?)";	
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			pre.setString(1,kh.getHoten());
			pre.setString(2,kh.getSdt());
			pre.setString(3,kh.getEmail());
			pre.setString(4,kh.getDiachi());
			pre.setString(5,kh.getPass());
			pre.setString(6,kh.getGhichu());
			int i =pre.executeUpdate();
			if(i == 0) {
				System.out.println("them moi that bai");
			}else {
				System.out.println("them moi thanh cong");
				check = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return check;
	}
	
	//----------------------- sua thong tin
	
	public boolean suakh(khachhang kh) {
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
			pre.setInt(7,makhcb);
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
	
	public static void main(String[] args) {
		khachhang kh = new khachhang();
		kh.setHoten("dat");
		kh.setPass("123");
		kh.setSdt("123");
		kh.setDiachi("thai binnh");
		kh.setEmail("a@gmail.com");
		kh.setGhichu("sieu dep trai");
		new LoginDao().themmo(kh);
	}
	
	
}
