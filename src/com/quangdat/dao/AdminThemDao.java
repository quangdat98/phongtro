package com.quangdat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.quangdat.DB.connectionDB;
import com.quangdat.model.LoaiPhong;
import com.quangdat.model.QuanTri;
import com.quangdat.model.TinTuc;
import com.quangdat.model.khachhang;

public class AdminThemDao {
	connectionDB connection = new connectionDB();
	
	public boolean adminThemTT(TinTuc kh) {
		boolean check = false;
		Connection conn = connection.getConnection();	
		PreparedStatement pre= null;	
		String  query = " insert into tintuc(TieuDe,MoTa,NoiDung,NgayDang,MaQT,anh) values(?,?,?,?,?,?)";	
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			pre.setString(1,kh.getTieude());
			pre.setString(2,kh.getMota());
			pre.setString(3,kh.getNoidung());
			pre.setDate(4,DatPhongDao.layNgayHienTai());
			pre.setInt(5,kh.getMaqt());
			pre.setString(6,kh.getAnh());
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
	
	public boolean adminThem(QuanTri qt) {
		boolean check = false;
		Connection conn = connection.getConnection();	
		PreparedStatement pre= null;	
		String  query = " insert into nguoiquantri(HoTen,SDT,Email,DiaChi,Pass) values(?,?,?,?,?)";	
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			pre.setString(1,qt.getHoten());
			pre.setString(2,qt.getSdt());
			pre.setString(3,qt.getEmail());
			pre.setString(4,qt.getDiachi());
			pre.setString(5,qt.getPass());
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
	
	public boolean adminthemloaiphong(LoaiPhong lp) {
		boolean check = false;
		Connection conn = connection.getConnection();	
		PreparedStatement pre= null;	
		String  query = " insert into loaiphong(TenLoaiPhong,MoTa) values(?,?)";	
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			pre.setString(1,lp.getTenloaiphong());
			pre.setString(2,lp.getMota());
			
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
	
	
}
