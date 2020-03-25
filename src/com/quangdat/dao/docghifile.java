package com.quangdat.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class docghifile {
	public static void main(String[] args) {
		
		
		
	}
	
	public void docghifile(float tien,int tgian,String chitiet,String noidung,String kh,String diachi,String NguoiDang) {
		Random layid = new Random();
		int a=0;
		a=layid.nextInt(10000);
		try {
			FileWriter fw = new FileWriter("E:\\hoadon"+a+".txt");
			fw.write("\t\t Hóa đơn thuê phòng\n");
			fw.write("\t Người Thuê: "+kh+"\n");
			fw.write("\t Người Đăng: "+NguoiDang+"\n");
			fw.write("\tThời gian thuê(tháng): "+tgian+"\n");
			fw.write("\tĐịa chỉ: "+diachi+"\n");
			fw.write("\tSố tiền phải trả: "+tien+" VND\n");
			fw.write("\tChi tiết: "+chitiet+"\n");
			fw.write("\tNội dung: "+noidung+"\n");
			fw.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
