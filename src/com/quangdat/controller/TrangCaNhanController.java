package com.quangdat.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quangdat.dao.DatPhongDao;
import com.quangdat.dao.LoaiPhongDao;
import com.quangdat.dao.LoginDao;
import com.quangdat.dao.PhongTroDao;
import com.quangdat.dao.docghifile;
import com.quangdat.model.PhongTro;
import com.quangdat.model.khachhang;

@Controller
public class TrangCaNhanController {
	
	LoginDao loDao = new LoginDao();
	
	DatPhongDao datphongDao = new DatPhongDao();
	
	LoaiPhongDao lp = new LoaiPhongDao();
	
	PhongTroDao ptd = new PhongTroDao();
	
	int makh_cb = 0;
	
	String tennguoidang = null;
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/kiemtra")
	public String ktra(Model model,@RequestParam String email,@RequestParam String pass,HttpSession session) {
		
		
		if(loDao.KiemTra(email, pass)) {
			khachhang kh = loDao.getKhachHang(email, pass);
			makh_cb=kh.getMakh();
			System.out.println("o ham login  "+makh_cb);
			System.out.println("o ham login 2  "+makh_cb);
			//loDao.getKhachHang(email, pass);
			session.setAttribute("user", kh);
			tennguoidang=kh.getHoten();
			model.addAttribute("sl", datphongDao.getSoLuong(makh_cb));
		//	model.addAttribute("list_giohang", datphongDao.layGioHang(makh_cb));
			return "trangcanhan";
		}else {
			model.addAttribute("loi", "khong thanh cong");
			return "formloi";
		}
		
	}
	@RequestMapping("/trangcanhan")
	public String trangcanhan(HttpServletRequest rep ,Model model) {
		HttpSession session = rep.getSession();
		model.addAttribute("user",session.getAttribute("user"));
		model.addAttribute("list_giohang", datphongDao.laydanhsach(makh_cb));
		return "trangcanhan";
	}
	
	
	
	//-------------------------- dang ky ----------------------
	@RequestMapping("/dangky")
	public String Stringdangky() {
		return "dangky";
	}
	@PostMapping("/dangky")
	public String dangky(@ModelAttribute khachhang kh) {
		if(loDao.themmo(kh)) {
			System.out.println(" da nhay vao trong controller kkkkkkkkkkkkkk");
			return "redirect:login";
		}
		return "dangky";
		
	}
	
	//-----------------------------sua kh ---------------------------
	@RequestMapping("/sua")
	public String sua(Model model,HttpSession session) {
		khachhang kh = (khachhang) session.getAttribute("user");
		model.addAttribute("user", kh);
		return "suatrangcanhan";
	}
	
	@PostMapping("/sua")
	public String suatt(@ModelAttribute khachhang kh) {
		
		if(loDao.suakh(kh)) {
			
			return "login";
		}
		return "suatrangcanhan";
	}
	
	//------------------------------------dat phong
	
	@GetMapping("/datphong")
	public String datphong(Model model,@RequestParam int id) {
		model.addAttribute("ptro",ptd.getPhongTro(id));
		return "formdatphong";
	}
	
	@PostMapping("/datphong")
	public String datphong1(Model model,HttpSession session,@RequestParam int maphong,@RequestParam int thoigian,@RequestParam String chitiet,@RequestParam String noidung) {
		khachhang kh = (khachhang) session.getAttribute("user");
		System.out.println("đây là mã kh:"+kh.getMakh());
		System.out.println("ma cuc bo:"+makh_cb);
		if(datphongDao.getDatPhong(makh_cb, maphong, thoigian, chitiet, noidung)) {
			model.addAttribute("sl", datphongDao.getSoLuong(makh_cb));
			model.addAttribute("list_giohang", datphongDao.laydanhsach(makh_cb));
			return "trangcanhan";
		}
		return "datphong";
	}
	
	
	
	
	
	
	// ------------------------------------ dang phong
	
	@RequestMapping("/dangphong")
	public String dangphong1() {
		return "formdangphong";
	}
	@PostMapping("/dangphong")
	public String dangphong2(@ModelAttribute PhongTro ptro) {
		ptro.setNguoidang(tennguoidang);
		if(ptd.dangphongtro(ptro)) {
		System.out.println("da dang phong");
		return "redirect:tranghome";
		
		}
		return "formdangphong";
	}
	
	
	
}
