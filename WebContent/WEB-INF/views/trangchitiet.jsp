<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


	<link rel="stylesheet" type="text/css" href="resources/css/trangchitiet.css">
	<link rel="stylesheet" type="text/css" href="resources/css/trangchu.css">
	<link href="<c:url value="resources/bootstrap/bootstrap.min.css" />" rel="stylesheet" />
</head>
<body>
		<div class="container">
		
	<jsp:include page="header.jsp"></jsp:include>

	<!-- đây là phần content -->
	
	<div class = "content_trangchitiet">

		<div class ="row">
			<div class ="col-6">
				<img src="<c:url value="${ptro.getAnh()}" />" alt="">
			</div>

			<div class ="col-5" style="background: red;">
				<h3>Giá Phòng:${ptro.getGia()}</h3><br/>
				<p>Địa Chỉ: ${ptro.getDiachi()}</p>
				<p>Mô Tả: ${ptro.getMota()}</p>
				<p>Diện Tích: ${ptro.getDientich()}</p>
				<p>Loại Phòng: ${ptro.getMaloaiphong() }</p>
				<p><a href="datphong?id=${ptro.getMaphong()}" class="btn btn-primary">Đặt Phòng</a></p>
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
</body>
</html> alt=""