package com.quangdat.model;

import java.util.Date;

public class TinTuc {
	private int matt;
	private String tieude;
	private String mota;
	private String noidung;
	private Date ngaydang;
	private int maqt;
	private String anh;
	public int getMatt() {
		return matt;
	}
	public void setMatt(int matt) {
		this.matt = matt;
	}
	public String getTieude() {
		return tieude;
	}
	public void setTieude(String tieude) {
		this.tieude = tieude;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	public Date getNgaydang() {
		return ngaydang;
	}
	public void setNgaydang(Date ngaydang) {
		this.ngaydang = ngaydang;
	}
	public int getMaqt() {
		return maqt;
	}
	public void setMaqt(int maqt) {
		this.maqt = maqt;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
}
