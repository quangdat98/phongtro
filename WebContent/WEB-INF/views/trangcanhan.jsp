<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/trangchu.css">
<link rel="stylesheet" type="text/css" href="resources/css/canhan.css">
<link href="<c:url value="resources/bootstrap/bootstrap.min.css" />" rel="stylesheet" />
	  <style type="text/css" media="screen">
  	.a1 li{
  display:inline-block;
  position:relative;
  margin:-2px;

}
.a1 a{
	border-radius: 5px;
  display:block;
  width:100px;
  height:40px;
  line-height:40px;
  background:#00FFFF;
  text-decoration:none;
  text-align:center;

}
.a1 a:hover{
  background:red;
  color:#ffff;
}
ul .a2{
  display:none;
  position:absolute;

  width:98px;

}
.a1 li:hover ul.a2{
  display:block;
}
  </style>
</head>
<body>
	<div class="container">

		<jsp:include page="header.jsp"></jsp:include>

		<!-- đây là phần content -->

		<div class="content_canhan">

			<div class="row" style="margin-top: 50px; margin-left: 50px">
				<div class="col-6">
					<p>Họ Tên:
					<h3>${user.getHoten()}</h3>
					</p>
					<p>Số điện Thoại:
					<h3>${user.getSdt()}</h3>
					</p>
					<p>Email:
					<h3>${user.getEmail()}</h3>
					</p>
					<P>Địa Chỉ:
					<h3>${user.getDiachi() }</h3>
					</P>
					<p>Pass:
					<h3>${user.getPass() }</h3>
					</p>
					<p>Ghi Chú:
					<h3>${user.getGhichu() }</p>
				</div>

				<div class="col-6">
					<p>
						<a href="sua" class="btn btn-primary">Sửa Thông Tin cá Nhân</a>
					</p>
					<p>
						<a href="dangphong" class="btn btn-primary">Đăng Phòng Trọ</a>
					</p>
					<p>
						<!-- Example single danger button -->
						 <li><a href="#">Giỏ Hàng <span style="color: red">${sl}</span>  </a>
				      <ul class="a2">
				      <c:forEach items="${list_giohang}" var="ds">
				      	 <li><a href="giohang?id=${ds.getMadp()}">${ds.getTongtien()}</a></li>
				      </c:forEach>
				       
				        
				      </ul>
				  </li>
					</p>

					<p>
						<a href="#" class="btn btn-primary">Log Out</a>
					</p>
				</div>
			</div>
		</div>





		<!-- đây là phần duoi content -->

		<div class="footer">
			<div class="row">
				<div class="col-4">
					<h4>Phòng Trọ Giá Rẻ Hà Nội</h4>
					<br />
					<p>Nguyễn Quang Đạt</p>
					<br />
					<p>Email: dat26011998@gmail.com</p>
					<br />
					<p>Phone: 0325807700</p>
				</div>

				<div class="col-4">
					<h4>Địa Chỉ:</h4>
					<br />
					<p>Ngõ 80 -Đường Xuân Phương - Phương Canh - Nam Từ Liên - Hà
						Nội
				</div>

				<div class="col-4"></div>
			</div>

		</div>

	</div>
</body>
</html>