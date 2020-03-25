package com.quangdat.model;

import java.util.Date;

public class datphong {
	private int madp;
	private int thoigian;
	private Date tgtaohoadon;
	private int makh;
	private int maphong;
	private String chitiet;
	private String noidung;
	private float tongtien;
	
	private khachhang khang;
	private PhongTro ptro;
	
	public khachhang getKhang() {
		return khang;
	}
	public void setKhang(khachhang khang) {
		this.khang = khang;
	}
	public PhongTro getPtro() {
		return ptro;
	}
	public void setPtro(PhongTro ptro) {
		this.ptro = ptro;
	}
	public int getMadp() {
		return madp;
	}
	public void setMadp(int madp) {
		this.madp = madp;
	}
	
	public int getThoigian() {
		return thoigian;
	}
	public void setThoigian(int thoigian) {
		this.thoigian = thoigian;
	}
	public Date getTgtaohoadon() {
		return tgtaohoadon;
	}
	public void setTgtaohoadon(Date tgtaohoadon) {
		this.tgtaohoadon = tgtaohoadon;
	}
	public int getMakh() {
		return makh;
	}
	public void setMakh(int makh) {
		this.makh = makh;
	}
	public int getMaphong() {
		return maphong;
	}
	public void setMaphong(int maphong) {
		this.maphong = maphong;
	}
	public String getChitiet() {
		return chitiet;
	}
	public void setChitiet(String chitiet) {
		this.chitiet = chitiet;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	public float getTongtien() {
		return tongtien;
	}
	public void setTongtien(float tongtien) {
		this.tongtien = tongtien;
	}
}
