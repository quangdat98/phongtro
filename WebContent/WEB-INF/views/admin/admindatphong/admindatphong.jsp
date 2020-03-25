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
		<table class="table table-striped table-dark"
			style="margin-top: 100px">
			<thead>
				<tr>
					<th scope="col">STT</th>
					<th scope="col">Mã Đặt Phòng</th>
					<th scope="col">Thời gian tạo HD</th>
					<th scope="col">Mã KH</th>
					<th scope="col">Mã Phòng</th>
					<th scope="col">Chi Tiết</th>
					<th scope="col">Nội Dung</th>
					<th scope="col">Tổng Tiền</th>
					<th scope="col">Thời Gian</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${list}"  var="ds">
			
					<tr>
						<th scope="row"></th>
						<td>${ds.getMadp()}</td>
						<td>${ds.getTgtaohoadon()}</td>
						<td>${ds.getMakh()}</td>
						<td>${dp.getMaphong()}</td>
						<td>${ds.getChitiet()}</td>
						<td>${ds.getNoidung()}</td>
						<td>${ds.getTongtien()}</td>
						<td>${ds.getThoigian()}</td>
						<td><a href="xoadp?id=${ds.getMadp()}">Xóa</a><a href="suadp?id=${ds.getMadp()}">Sửa</a></td>
					</tr>
				</c:forEach>
		
			</tbody>
		</table>

		</form>
	</div>
</body>
</html>