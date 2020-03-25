package com.quangdat.controller;

import javax.servlet.http.HttpSession;

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
import com.quangdat.dao.TinTucDao;
import com.quangdat.model.QuanTri;
import com.quangdat.model.TinTuc;
import com.quangdat.model.khachhang;

@Controller
public class AdminController {

	AdminDao admin = new AdminDao();

	AdminSuaDao admins = new AdminSuaDao();

	AdminThemDao admint = new AdminThemDao();

	AdminHienDao adminh = new AdminHienDao();

	TinTucDao tt = new TinTucDao();

	@RequestMapping("/homeadmin")
	public String admin() {
		return "admin/adminlogin";
	}

	@PostMapping("/kiemtraadmin")
	public String kiemtraadmin(@RequestParam String email, @RequestParam String pass, Model model,
			HttpSession session) {
		QuanTri qt = new QuanTri();
		qt = admin.KiemTra(email, pass);

		if (qt.getHoten() != null) {
			session.setAttribute("qt", admin.KiemTra(email, pass));
			model.addAttribute("listqt", admin.getList());
			return "admin/admin";
		}
		return "formloi";

	}
	@RequestMapping("/trangadmin")
	public String adminhome(Model model) {
		model.addAttribute("listqt", admin.getList());
		return "admin/admin";
	}

	@RequestMapping("/xoaadmin")
	public String xoa(@RequestParam int id, Model model) {
		if (admin.xoaadmin(id)) {
			model.addAttribute("listqt", admin.getList());
			return "admin/admin";
		}
		model.addAttribute("listqt", admin.getList());
		return "admin/admin";
	}

	@RequestMapping("/adminsua")
	public String sua(@RequestParam int id, Model model) {
		model.addAttribute("qt", admins.getAdminById(id));
		return "admin/adminsua";
	}

	@PostMapping("/adminsua")
	public String suaadmin(@ModelAttribute QuanTri qt, Model model) {
		if (admins.adminsua(qt)) {
			model.addAttribute("listqt", admin.getList());
			return "admin/admin";
		}
		return "admin/adminsua";
	}

	@RequestMapping("/adminthem")
	public String them() {
		return "admin/adminthem";
	}

	@PostMapping("/adminthem")
	public String them1(@ModelAttribute QuanTri qt, Model model) {
		if (admint.adminThem(qt)) {
			model.addAttribute("listqt", admin.getList());
			return "admin/admin";
		}
		return "admin/adminthem";

	}



	// ----------------- hien tin tuc
	@RequestMapping("/admintintuc")
	public String tintuc(Model model) {
		model.addAttribute("ds", tt.getListTinTuc());
		return "admin/admintt/admintintuc";
	}

	@RequestMapping("/themtt")
	public String themtt(Model model) {
		return "admin/admintt/admintintuc";
	}

	@PostMapping("/themtt")
	public String themttt(Model model, @ModelAttribute TinTuc tintuc) {
		if (tt.adminThemTT(tintuc)) {
			model.addAttribute("ds", tt.getListTinTuc());
			return "admin/admintt/admintintuc";
		} else
			return "admin/admintt/admintintuc";
	}

	@RequestMapping("/xoatt")
	public String xoatt(@RequestParam int id, Model model) {
		if (admin.xoatintuc(id)) {
			model.addAttribute("ds", tt.getListTinTuc());
			return "admin/admintt/admintintuc";
		}
		model.addAttribute("ds", tt.getListTinTuc());
		return "admin/admintt/admintintuc";
	}

	@RequestMapping("/suatt")
	public String suatt(Model model, @RequestParam int id) {
		model.addAttribute("tt", tt.getTinTuc(id));
		return "admin/admintt/adminsuatt";
	}

	@PostMapping("/suatt")
	public String suatt2(Model model, @ModelAttribute TinTuc tintuc) {
		if (admins.adminsuatintuc(tintuc)) {
			model.addAttribute("ds", tt.getListTinTuc());
			return "admin/admintt/admintintuc";
		}
		return "admin/admintt/adminsuatt";
	}

	// -------------------------- khach hang

	@RequestMapping("/khachh")
	public String Khachh(Model model) {
		model.addAttribute("list", adminh.getList());
		return "admin/adminkh/adminkh";
	}

	@RequestMapping("/xoakh")
	public String khang(Model model, @RequestParam int id) {
		if (admin.xoakhachhang(id)) {
			model.addAttribute("list", adminh.getList());
			return "admin/adminkh/adminkh";
		}
		model.addAttribute("list", adminh.getList());
		return "admin/adminkh/adminkh";
	}
	
	@RequestMapping("/suakh")
	public String suakh(@RequestParam int id,Model model) {
		model.addAttribute("kh", adminh.getKhById(id));
		return "admin/adminkh/suakh";
	}
	@PostMapping("/suakh")
	public String suakk1(@ModelAttribute khachhang kh,Model model) {
		if(admins.adminsuakh(kh)) {
			model.addAttribute("list", adminh.getList());
			return "admin/adminkh/adminkh";
		}
		return "redirect:suakh";
	}
}
