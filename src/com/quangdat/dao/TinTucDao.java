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
import com.quangdat.model.TinTuc;

public class TinTucDao {
	connectionDB connection = new connectionDB();
	
	public List<TinTuc> getListTinTuc(){
		List<TinTuc> list = new ArrayList<>();
		Connection conn = null;
		Statement stm = null;
		String Query="select * from tintuc";
		ResultSet rs =null;
		
		conn=connection.getConnection();
		try {
			stm=conn.createStatement();
			rs=stm.executeQuery(Query);
			while(rs.next()) {
				TinTuc tinTuc = new TinTuc();
				tinTuc.setTieude(rs.getString("TieuDe"));
				tinTuc.setNgaydang(rs.getDate("NgayDang"));
				tinTuc.setMota(rs.getString("MoTa"));
				tinTuc.setNoidung(rs.getString("NoiDung"));
				tinTuc.setAnh(rs.getString("anh"));
				tinTuc.setMatt(rs.getInt("MaTT"));
				list.add(tinTuc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return list;
	}
	
	public TinTuc getTinTuc(int id) {
		TinTuc tinTuc = new TinTuc();
		String query="select * from tintuc where MaTT = ?";
		Connection conn = null;
		PreparedStatement pre = null;
		
		conn=connection.getConnection();
		ResultSet rs = null;
		try {
			pre=conn.prepareStatement(query);
			pre.setInt(1, id);
			rs=pre.executeQuery();
			
			while(rs.next()) {
				tinTuc.setMatt(rs.getInt("MaTT"));
				tinTuc.setAnh(rs.getString("anh"));
				tinTuc.setMota(rs.getString("MoTa"));
				tinTuc.setNgaydang(rs.getDate("NgayDang"));
				tinTuc.setNoidung(rs.getString("NoiDung"));
				tinTuc.setTieude(rs.getString("TieuDe"));
				tinTuc.setMaqt(rs.getInt("MaQT"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tinTuc;
	}
	
	
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
			pre.setString(6,"resources/images/"+kh.getAnh());
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
