package com.quangdat.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quangdat.dao.DatPhongDao;
import com.quangdat.dao.LoaiPhongDao;
import com.quangdat.dao.PhongTroDao;
import com.quangdat.dao.TinTucDao;
import com.quangdat.model.LoaiPhong;
import com.quangdat.model.PhongTro;
import com.quangdat.model.khachhang;

@Controller
public class HomeController {	
	
	PhongTroDao ptd = new PhongTroDao();
	
	TinTucDao ttdao = new TinTucDao();
	
	LoaiPhongDao LoaiPhongDao = new LoaiPhongDao();
	
	DatPhongDao DatPhongDao = new DatPhongDao();
	
	
	
	
	@RequestMapping("/")
	public String home(Model model,HttpSession session) {
		model.addAttribute("list", ptd.getList());
		model.addAttribute("list2", ptd.getGia());
		List<PhongTro> listt = new ArrayList<PhongTro>();
		session.setAttribute("loaiphong", LoaiPhongDao.getListLoaiPhong());
		return "Home";
	}
	@RequestMapping("/tranghome")
	public String home2(Model model) {
		model.addAttribute("list", ptd.getList());
		model.addAttribute("list2", ptd.getGia());
		return "Home";
	}
	
	@RequestMapping("/loaiphonghome")
	public String LoaiPhongHome(@RequestParam int id,Model model) {
		model.addAttribute("list", LoaiPhongDao.getPhongIdLoaiPhong(id));
		model.addAttribute("list2", ptd.getGia());
		return "Home";
	}
	
	@RequestMapping("/trangchitiet")
	public String trangchitiet(@RequestParam int id,Model model) {
		PhongTro ptro = new PhongTro();
		ptro=ptd.getPhongTro(id);
		model.addAttribute("ptro", ptro);
		return "trangchitiet";
	}
	//------------------------ dat phong
	
	
	
	//-------------------------gio hang
	DatPhongDao datphongDao = new DatPhongDao();
	
	@RequestMapping("/giohang")
	public String giohang(@RequestParam int id,Model model) {
		model.addAttribute("dp", DatPhongDao.layGioHang(id));
		model.addAttribute("id", id);
		return "giohang";
	}

	@RequestMapping("/inhoadon")
	public String inhoadon(@RequestParam int id) {
		datphongDao.ghihoadon(id);
		return "redirect:tranghome";
	}
	
	
	
	// ---------------------- tin tuc 
	
	@RequestMapping("/tintuc")
	public String trangtintuc(Model model) {
		model.addAttribute("list", ttdao.getListTinTuc());
		return "trangtintuc";
	}
	
	@RequestMapping("/trangttchitiet")
	public String trangttchitiet(@RequestParam int id,Model model) {
		model.addAttribute("tt",ttdao.getTinTuc(id));
		return "trangttchitiet";
	}
	
	//-------------------------- loai phong 
	

	
	
	
}
