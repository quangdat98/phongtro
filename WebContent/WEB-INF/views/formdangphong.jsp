<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/trangchu.css">
<link href="<c:url value="resources/bootstrap/bootstrap.min.css" />"
	rel="stylesheet" />
</head>
<body>
	<div class="container">

		<jsp:include page="header.jsp"></jsp:include>

		<!-- đây là phần content -->

		<form action="dangphong" method="post">
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">Giá</label> <input type="text" name="gia"
						class="form-control" id="inputEmail4">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Diện Tích</label> <input type="text"
						name="dientich" class="form-control" id="inputPassword4">
				</div>
			</div>
			<div class="form-group">
				<label for="inputAddress">Địa chỉ</label> <input type="text"
					name="diachi" class="form-control" id="inputAddress">
			</div>
			<div class="form-group">
				<label for="inputAddress2">Mô tả</label> <input type="text"
					name="mota" class="form-control" id="inputAddress2">
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputCity">Ảnh</label> 
					<input type="file" class="form-control-file" id="exampleFormControlFile1" name="anh">
				</div>
				<div class="form-group col-md-4">
					<label for="inputState">Mã loại phòng</label>
					 <select  name="maloaiphong"
						id="inputState" class="form-control">					
						<c:forEach items="${loaiphong}" var="ds">
							<%-- <div name="maloaiphong">${ds.getMaloaiphong()}111</div> --%>
							<option selected>${ds.getMaloaiphong()}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			  <button type="submit" class="btn btn-primary">Đăng</button>
		</form>





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