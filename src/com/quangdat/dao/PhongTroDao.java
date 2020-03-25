package com.quangdat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.quangdat.DB.connectionDB;
import com.quangdat.model.PhongTro;
import com.quangdat.model.khachhang;

public class PhongTroDao {
	connectionDB connection = new connectionDB();
	
	public List<PhongTro> getList(){
		List<PhongTro> list = new ArrayList<>();
		Connection conn = null;
		Statement stm = null;
		String Query="select top(12) anh,Gia,MoTa,MaPhong from phong ORDER BY MaPhong DESC";
		ResultSet rs =null;
		
		conn=connection.getConnection();
		try {
			stm=conn.createStatement();
			rs=stm.executeQuery(Query);
			while(rs.next()) {
				PhongTro phongTro = new PhongTro();
				phongTro.setAnh(rs.getString("anh"));
				phongTro.setGia(rs.getFloat("Gia"));
				phongTro.setMota(rs.getString("MoTa"));	
				phongTro.setMaphong(rs.getInt("MaPhong"));
				list.add(phongTro);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public List<PhongTro> getGia(){
		List<PhongTro> list = new ArrayList<>();
		Connection conn = null;
		Statement stm = null;
		String Query="select top(5) anh,Gia,MoTa,MaPhong from phong ORDER BY Gia DESC  ";
		ResultSet rs =null;
		
		conn=connection.getConnection();
		try {
			stm=conn.createStatement();
			rs=stm.executeQuery(Query);
			while(rs.next()) {
				PhongTro phongTro = new PhongTro();
				phongTro.setAnh(rs.getString("anh"));
				phongTro.setGia(rs.getFloat("Gia"));
				phongTro.setMota(rs.getString("MoTa"));	
				phongTro.setMaphong(rs.getInt("MaPhong"));
				list.add(phongTro);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	
	public PhongTro getPhongTro(int id) {
		PhongTro phongTro = new PhongTro();
		String query="select * from phong where MaPhong = ?";
		Connection conn = null;
		PreparedStatement pre = null;
		
		conn=connection.getConnection();
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			pre.setInt(1, id);
			
			rs=pre.executeQuery();
			
			while(rs.next()) {
				phongTro.setMota(rs.getString("MoTa"));
				phongTro.setAnh(rs.getString("anh"));
				phongTro.setDientich(rs.getString("DienTich"));
				phongTro.setDiachi(rs.getString("DiaChi"));
				phongTro.setGia(rs.getFloat("Gia"));
				phongTro.setMaloaiphong(rs.getInt("MaLoaiPhong"));
				phongTro.setMaphong(rs.getInt("MaPhong"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return phongTro;
	}
	
	//------------------------------------
	
	
	public boolean dangphongtro(PhongTro ptro) {
		boolean check = false;
		Connection conn = connection.getConnection();	
		PreparedStatement pre= null;	
		String  query = " insert into phong(DiaChi,MoTa,DienTich,Gia,anh,MaLoaiPhong,NguoiDang) values(?,?,?,?,?,?,?)";	
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			pre.setString(1,ptro.getDientich());
			pre.setString(2,ptro.getMota());
			pre.setString(3,ptro.getDientich());
			pre.setFloat(4,ptro.getGia());
			pre.setString(5,"resources/images/"+ptro.getAnh());
			pre.setInt(6,ptro.getMaloaiphong());
			pre.setString(7,ptro.getNguoidang());
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
	
	public static void main(String[] args) {
		List<PhongTro> list = new PhongTroDao().getList();
		
		for(PhongTro ds: list ) {
			System.out.println(ds.getMota());
		}
	}
}
