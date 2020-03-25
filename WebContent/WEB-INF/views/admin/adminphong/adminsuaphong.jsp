<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value="resources/bootstrap/bootstrap.min.css" />"
	rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="resources/css/admin.css">
</head>
<body>
	<div class="container">

		<jsp:include page="headeradmin.jsp"></jsp:include>

		<br />
		<p style="margin-left: -50px">
		<h3>Phòng Trọ > ></h3>
		</p>

		<form action="suaphong1" method="post">
			<div class="form-group">
				<label for="inputAddress">Mã Phòng</label> <input type="text" readonly="readonly"
					name="maphong" class="form-control" value="${ptro.getMaphong()}">
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">Giá</label> <input type="text" name="gia"
						class="form-control" value="${ptro.getGia()}">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Diện Tích</label> <input type="text"
						name="dientich" class="form-control" value="${ptro.getDientich()}">
				</div>
			</div>
			<div class="form-group">
				<label for="inputAddress">Địa chỉ</label> <input type="text"
					name="diachi" class="form-control" value="${ptro.getDiachi()}">
			</div>
			<div class="form-group">
				<label for="inputAddress2">Mô tả</label> <input type="text"
					name="mota" class="form-control" value="${ptro.getMota()}">
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputCity">Ảnh</label> <input type="file"
						class="form-control-file" value="${ptro.getAnh()}" name="anh">
				</div>
				<div class="form-group col-md-4">
					<div class="form-group">
						<label for="inputAddress2">Mã loại Phòng</label> <input type="text"
							name="maloaiphong" class="form-control" value="${ptro.getMaloaiphong()}">
					</div>
				</div>
			</div>
			<button type="submit" class="btn btn-primary">Sửa</button>
		</form>
	</div>

</body>
</html>