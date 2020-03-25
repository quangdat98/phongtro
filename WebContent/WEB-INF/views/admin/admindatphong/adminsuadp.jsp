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

		<form action="suadp" method="post">
			<div class="form-group">
				<label for="inputAddress">Mã Đặt Phòng</label> <input type="text" readonly="readonly"
					name="madp" class="form-control" value="${dp.getMadp()}">
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">Thời Gian Tạo HD</label> <input type="text" name="tgtaohoadon"
						class="form-control" value="${dp.getTgtaohoadon()}">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Nội Dung</label> <input type="text"
						name="noidung" class="form-control" value="${dp.getNoidung()}">
				</div>
			</div>
			<div class="form-group">
				<label for="inputAddress">Chi Tiết</label> <input type="text"
					name="chitiet" class="form-control" value="${dp.getChitiet()}">
			</div>
			<div class="form-group">
				<label for="inputAddress2">Thời Gian</label> <input type="text"
					name="thoigian" class="form-control" value="${dp.getThoigian()}">
			</div>
			<div class="form-row">

				<div class="form-group col-md-4">
					<div class="form-group">
						<label for="inputAddress2">Mã KH</label> <input type="text"
							name="makh" class="form-control" value="${dp.getMakh()}">
					</div>
				</div>
				<div class="form-group col-md-4">
					<div class="form-group">
						<label for="inputAddress2">Mã Phòng</label> <input type="text"
							name="maloaiphong" class="form-control" value="${dp.getMaphong()}">
					</div>
				</div>
			</div>
			<div class="form-group">
				<label for="inputAddress2">Tổng Tiền</label> <input type="text"
					name="tongtien" class="form-control"  value="${dp.getTongtien()}">
			</div>
			<button type="submit" class="btn btn-primary">Sửa</button>
		</form>
	</div>

</body>
</html>