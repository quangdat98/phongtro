<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/trangchu.css">
<link rel="stylesheet" type="text/css" href="resources/css/trangtintuc.css">
<link href="<c:url value="resources/bootstrap/bootstrap.min.css" />" rel="stylesheet" />
</head>
<body>
	<div class="container">
		
		<jsp:include page="header.jsp"></jsp:include>

	<!-- đây là phần content -->
	
	<div class = "content_tintuc">
		
		<c:forEach items="${list}" var="ds" >
			<div class = "row" style="margin-top:20px;margin-left: 20px">
				<div class = "col-11">
						<div class="card mb-3">
						  <img class="card-img-top" src="resources/images/anhphong1.jpg" alt="Card image cap">
						  <div class="card-body">
						    <h5 class="card-title">${ds.getTieude()}</h5>
						    <p class="card-text">${ds.getMota()}</p>
						    <p class ="card-text">${ds.getNgaydang()}</p>
						    <p class="card-text"><a href="trangttchitiet?id=${ds.getMatt()}" class="btn btn-primary">Xem Chi Tiết</a></p>
						  </div>
						</div>				
				</div>			
			</div>
		</c:forEach>
		

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