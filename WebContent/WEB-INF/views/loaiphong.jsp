<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

	<link rel="stylesheet" type="text/css" href="resources/css/trangchu.css">
	<link href="<c:url value="resources/bootstrap/bootstrap.min.css" />" rel="stylesheet" />

	
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
<!--  <script src="resources/js/bootstrap.min.js" type="text/javascript"></script>
 <script src="resources/js/js.js" type="text/javascript"></script> -->
 
</head>
<body>
	<div class="container">
		
		<jsp:include page="header.jsp"></jsp:include>
		
		<div class ="anh">
				  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
				    <ol class="carousel-indicators">
				      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				      <li data-target="#myCarousel" data-slide-to="1"></li>
				      <li data-target="#myCarousel" data-slide-to="2"></li>
				    </ol>

    <!-- Wrapper for slides -->
				    <div class="carousel-inner">
				      <div class="item active">
				        <img src="resources/images/anhphong1lai.jpg" alt="Los Angeles" style="width:100%;height: 500px">
				      </div>

				      <div class="item">
				        <img src="resources/images/anhphong2.jpg" alt="Chicago" style="width:100%;height: 500px">
				      </div>
				    
				      <div class="item">
				        <img src="resources/images/anhphong3.jpg" alt="New york" style="width:100%;height: 500px">
				      </div>
				    </div>

    <!-- Left and right controls -->
				    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
				      <span class="glyphicon glyphicon-chevron-left"></span>
				      <span class="sr-only">Previous</span>
				    </a>
				    <a class="right carousel-control" href="#myCarousel" data-slide="next">
				      <span class="glyphicon glyphicon-chevron-right"></span>
				      <span class="sr-only">Next</span>
				    </a>
 				</div>

		</div>
	<!-- đây là phần content -->
		<div class="content">
			<h3>Phòng Trọ Dành Cho Bạn >> >></h3>

			<div class="row">
				<c:forEach items="${list}" var ="ds">
					<div class ="col-3">
						<div class="card" style="width: 18rem;margin-left: 20px">
							  <img class="card-img-top" style="width: 178px;height: 178px" src="<c:url value="${ds.getAnh()}" />" alt="Card image cap">
							  <div class="card-body">
								    <h5 class="card-title">${ds.getGia()}</h5>
								    <p class="card-text">${ds.getMota()}</p>
								    <a href="trangchitiet?id=${ds.getMaphong()}" class="btn btn-primary">Xem Chi Tiết</a>
							  </div>
						</div>
					</div>
				</c:forEach>

			

			</div>

			<div class ="row">
				<h3 style="margin-left:35px;color: #FFFFFF">Các Phòng Trọ Nổi Bật >>  >> </h3>

				<div class="col-9" style="margin-left: 10%;">
				<c:forEach items="${list2}" var ="ds">
					<div class="card mb-3" style="margin-bottom: 50px">
	  					<img id="anhnoibat" class="card-img-top" src="<c:url value="${ds.getAnh()}"/>" alt="Card image cap">
					  <div class="card-body">
					    <h5 class="card-title">${ds.getGia()}</h5>
					    <p class="card-text">${ds.getMota()}</p>
					    <p class="card-text" style="text-align: center"> <a href="trangchitiet?id=${ds.getMaphong()}" class="btn btn-primary">Xem Chi Tiết</a></p>
					  </div>
					</div>
					<br/><br/>
				</c:forEach>
					
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