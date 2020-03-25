package com.quangdat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.quangdat.DB.connectionDB;
import com.quangdat.model.LoaiPhong;
import com.quangdat.model.PhongTro;

public class LoaiPhongDao {
	connectionDB connection = new connectionDB();
	
	public List<LoaiPhong> getListLoaiPhong() {
		Connection conn =connection.getConnection();
		List<LoaiPhong> list = new ArrayList<LoaiPhong>();
		
		PreparedStatement pre= null;
	
		
		String query="select * from LoaiPhong";
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			rs=pre.executeQuery();
			
			while(rs.next()) {
				LoaiPhong lp  = new LoaiPhong();
				lp.setTenloaiphong(rs.getString("TenLoaiPhong"));
				lp.setMaloaiphong(rs.getInt("MaLoaiPhong"));
				lp.setMota(rs.getString("MoTa"));
				list.add(lp);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	
	public List<PhongTro> getPhongIdLoaiPhong(int id) {
		List<PhongTro> list = new ArrayList<>();
	
		String query="select * from phong where MaLoaiPhong = ?";
		Connection conn = null;
		PreparedStatement pre = null;
		
		conn=connection.getConnection();
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			pre.setInt(1, id);
			
			rs=pre.executeQuery();
			
			while(rs.next()) {
				PhongTro phongTro = new PhongTro();
				phongTro.setMota(rs.getString("MoTa"));
				phongTro.setAnh(rs.getString("anh"));
				phongTro.setDientich(rs.getString("DienTich"));
				phongTro.setDiachi(rs.getString("DiaChi"));
				phongTro.setGia(rs.getFloat("Gia"));
				phongTro.setMaloaiphong(rs.getInt("MaLoaiPhong"));
				phongTro.setMaphong(rs.getInt("MaPhong"));
				list.add(phongTro);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}

}
