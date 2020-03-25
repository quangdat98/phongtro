<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="resources/css/trangchu.css">
	<link rel="stylesheet" type="text/css" href="resources/css/giohang.css">
	<link href="<c:url value="resources/bootstrap/bootstrap.min.css" />" rel="stylesheet" />
</head>
<body>
		<div class="container">
		
	<jsp:include page="header.jsp"></jsp:include>

	<!-- đây là phần content -->
	
		
			<div class = "content_giohang" style="height: 700px">
			<div class="row">

				<div id="left" class = "col-4" >
							<img src="${dp.getPtro().getAnh()}" alt="">
				</div>

				<div class="col-3">
					<div style="padding-top:50px;margin-left: 100px">
								<span>Mã Đặt Phòng:</span><br/><br/>
								<span>Tổng tiền:</span><br/><br/>
								<span>Thời Gian (tháng):</span><br/><br/><br/>
								<span>Chi Tiết: </span><br/><br/><br/><br/>
								<span>Nội Dung: </span><br/><br/></br></br></br></br>
								<span>Khách Hàng: </span></br></br>
								<span>Địa chỉ: </span></br></br>
					</div>
				</div>

			

				<div id="right" class = "col-4" >
							<div class="doc">
								<span><input type="text" readonly="1" value="${id}" name="id"/></span><br/><br/>
								<span><input type="text" readonly="1" value="${dp.getTongtien()}"/></span><br/><br/>
								<span><input type="text" readonly="1" value="${dp.getThoigian()}" /></span><br/><br/>
								<span><input type="textarea" readonly="1"  style="width: 300px;height: 100px" value="${dp.getChitiet()}" /></span><br/><br/>
								<span><input type="textarea" readonly="1"  style="width: 300px;height: 100px" value="${dp.getNoidung()}"/></span><br/><br/>
								<span><input type="text" readonly="1" value="${user.getHoten()}" /></span><br/><br/>
								<span><input type="text" readonly="1" value="${dp.getPtro().getDiachi()}" /></span><br/><br/>
								 <a href="inhoadon?id=${id}" class="btn btn-primary">In Hóa Đơn</a>
							</div>
				</div>

			</div>
		
	</div>
		


	

		<!-- đây là phần duoi content -->

		<div class="footer">
			<div class="row">
				<div class="col-4">
					<h4>Phòng Trọ Giá Rẻ Hà Nội</h4><br/>
					<p>Nguyễn Quang Đạt</p><br/>
					<p>Email: dat26011998@gmail.com</p><br/>
					<p>Phone: 0325807700</p>
				</div>

			<div class="col-4">
				<h4>Địa Chỉ:</h4><br/>
				<p>Ngõ 80 -Đường Xuân Phương - Phương Canh - Nam Từ Liên - Hà Nội
			</div>

			<div class="col-4">
				
			</div>
			</div>
		
		</div>

	</div>
</body>
</html>