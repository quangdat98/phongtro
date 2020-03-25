package com.quangdat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quangdat.dao.AdminDao;
import com.quangdat.dao.AdminHienDao;
import com.quangdat.dao.AdminSuaDao;
import com.quangdat.dao.AdminThemDao;
import com.quangdat.dao.DatPhongDao;
import com.quangdat.dao.LoaiPhongDao;
import com.quangdat.dao.PhongTroDao;
import com.quangdat.model.LoaiPhong;
import com.quangdat.model.PhongTro;
import com.quangdat.model.datphong;

@Controller
public class AdminPhongController {

	AdminHienDao adminh = new AdminHienDao();

	AdminSuaDao admins = new AdminSuaDao();

	PhongTroDao ptrD = new PhongTroDao();

	AdminDao admin = new AdminDao();

	AdminThemDao admint = new AdminThemDao();

	LoaiPhongDao loaip = new LoaiPhongDao();
	// ----------------------------phong

	@RequestMapping("/adminphong")
	public String phong(Model model) {
		model.addAttribute("list", adminh.getListpPhong());
		return "admin/adminphong/adminphong";
	}

	@RequestMapping("/suaphong")
	public String suaphong(@RequestParam int id, Model model) {
		model.addAttribute("ptro", ptrD.getPhongTro(id));
		return "admin/adminphong/adminsuaphong";
	}

	@PostMapping("/suaphong1")
	public String suaphong1(@ModelAttribute PhongTro pt, Model model) {
		if (admins.adminsuaphong(pt)) {
			model.addAttribute("list", adminh.getListpPhong());
			return "admin/adminphong/adminphong";
		}
		return "redirect:adminphong";

	}

	@RequestMapping("/xoaphong")
	public String xoaphong(@RequestParam int id, Model model) {
		if (admin.xoaphong(id)) {
			model.addAttribute("list", adminh.getListpPhong());
			return "admin/adminphong/adminphong";
		}
		model.addAttribute("list", adminh.getListpPhong());
		return "admin/adminphong/adminphong";
	}

	// -------------------------------- loai phong

	@RequestMapping("/loaiphong")
	public String loaiphong(Model model) {
		model.addAttribute("list", loaip.getListLoaiPhong());
		return "admin/adminloaiphong/loaiphong";
	}

	@RequestMapping("/xoaloaiphong")
	public String xoaloai(Model model, @RequestParam int id) {
		if (admin.xoaloaiphong(id)) {
			model.addAttribute("list", loaip.getListLoaiPhong());
			return "admin/adminloaiphong/loaiphong";
		}
		model.addAttribute("list", loaip.getListLoaiPhong());
		return "admin/adminloaiphong/loaiphong";
	}

	@RequestMapping("sualoaiphong")
	public String sualoaiphong(Model model, @RequestParam int id) {

		model.addAttribute("lp", adminh.getLoaiPhong(id));
		return "admin/adminloaiphong/sualoaiphong";
	}

	@PostMapping("sualoaiphong")
	public String sualoaiphong1(Model model, @ModelAttribute LoaiPhong lp) {
		if (new AdminSuaDao().adminSuaLoai(lp)) {
			model.addAttribute("list", loaip.getListLoaiPhong());
			return "admin/adminloaiphong/loaiphong";
		}
		return "admin/adminloaiphong/sualoaiphong";

	}

	@RequestMapping("/themmoiloaiphong")
	public String themmoiloai() {
		return "admin/adminloaiphong/themloaiphong";
	}

	@PostMapping("themloaiphong")
	public String themloaiphong(Model model, @ModelAttribute LoaiPhong lp) {
		if (admint.adminthemloaiphong(lp)) {
			model.addAttribute("list", loaip.getListLoaiPhong());
			return "admin/adminloaiphong/loaiphong";
		}
		return "admin/adminloaiphong/themloaiphong";
	}

	// ---------------------------dat phong

	@RequestMapping("/admindatphong")
	public String datphong(Model model) {
		model.addAttribute("list", adminh.getListDatPhong());
		return "admin/admindatphong/admindatphong";
	}

	@RequestMapping("/xoadp")
	public String xoadatphong(Model model, @RequestParam int id) {
		if (admin.xoaDatPhong(id)) {
			model.addAttribute("list", adminh.getListDatPhong());
			return "admin/admindatphong/admindatphong";
		}
		model.addAttribute("list", adminh.getListDatPhong());
		return "admin/admindatphong/admindatphong";

	}

	DatPhongDao dpD = new DatPhongDao();

	@RequestMapping("/suadp")
	public String suadp(@RequestParam int id, Model model) {
		model.addAttribute("dp", adminh.layDatPhong(id));
		return "admin/admindatphong/adminsuadp";
	}

	@PostMapping("/suadp")
	public String suaphong(@RequestParam String chitiet, @RequestParam int thoigian, @RequestParam float tongtien,
			@RequestParam String noidung,@RequestParam int madp, Model model) {
		if (dpD.suaDatPhong(chitiet, noidung, tongtien, thoigian, madp)) {
			model.addAttribute("list", adminh.getListDatPhong());
			return "admin/admindatphong/admindatphong";
		}
		return "admin/admindatphong/admindatphong";
	}
}
