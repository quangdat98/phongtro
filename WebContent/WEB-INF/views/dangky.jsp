<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="<c:url value="resources/bootstrap/bootstrap.min.css" />" rel="stylesheet" />
	<link rel="stylesheet" type="text/css" href="resources/css/trangchu.css">
</head>
<body>
		<div class="container">
		
		<div class="header">
			<div class="headeranh">
				<img src="resources/images/home.png" alt="" style="margin-left: 50px;float: left; ">
				<h2>Phòng Trọ Giá Rẻ Hà Nội</h2>
			</div>
			<div class="headermenu">
				<ul style="background: #33CC66">
					<li><a href="">Phòng Trọ</a></li>
					<li><a href="">Tin Tức</a></li>
					<li><a href="">Tài Khoản</a></li>
					<li><a href="">Trang Chủ</a></li>	
				</ul>
			</div>
		<!-- 	<img src="images/home.jpg" alt="">
			<ul>
				<li><a href="">Phòng Trọ</a></li>
				<li><a href="">Tin Tức</a></li>
				<li><a href="">Tài Khoản</a></li>
				<li><a href="">Trang Chủ</a></li>	
			</ul> -->
		</div>

	<!-- đây là phần content -->
	
	<div class = "content_dangky">
		
		<div class ="dangky" style="width: 80%;margin-left: 100px;margin-top:50px;margin-bottom: 50px">

			<form action="dangky" method="post">

 <div class="form-group">
			    <label for="formGroupExampleInput">Họ Tên</label>
			    <input type="text" class="form-control" id="formGroupExampleInput" name="hoten">
			  </div>
			  <div class="form-group">
			    <label for="formGroupExampleInput2">Số Điện Thoại</label>
			    <input type="text" class="form-control" id="formGroupExampleInput2" name="sdt">
			  </div>
			  <div class="form-group">
			    <label for="formGroupExampleInput2">Email</label>
			    <input type="text" class="form-control" id="formGroupExampleInput2" name="email">
			  </div>
			  <div class="form-group">
			    <label for="formGroupExampleInput2">Địa Chỉ</label>
			    <input type="text" class="form-control" id="formGroupExampleInput2" name="diachi">
			  </div>
			  <div class="form-group">
			    <label for="formGroupExampleInput2">PassWord</label>
			    <input type="password" class="form-control" id="formGroupExampleInput2" name="pass">
			  </div>
			  <div class="form-group">
			    <label for="formGroupExampleInput2">Ghi Chú</label>
			    <input type="text" class="form-control" id="formGroupExampleInput2" name="ghichu">
			  </div>
			
				<input  type="submit" value="Đăng Ký" style="background: #088A08;margin-left: 40%">


			</form>
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