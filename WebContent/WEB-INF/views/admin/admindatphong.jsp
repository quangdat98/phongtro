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
					<th scope="col">Mã DP</th>
					<th scope="col">Thời Gian Tạo</th>
					<th scope="col">Mã KH</th>
					<th scope="col">Mã Phòng</th>
					<th scope="col">Chi Tiết</th>
					<th scope="col">Nội Dung</th>
					<th scope="col">Thời gian</th>
					<th scope="col">Tổng tiền</th>
					
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td>Mark</td>
					<td>Otto</td>
					<td>@mdo</td>
					<td>Mark</td>
					<td>Otto</td>
					<td><img src="images/anhphong1.jpg" alt=""
						style="width: 150px; height: 150px;"></td>
					<td>@mdo</td>
					<td><a href="#">Xóa</a><a href="#">Sửa</a></td>
				</tr>
				<tr>
					<th scope="row">2</th>
					<td>Jacob</td>
					<td>Thornton</td>
					<td>@fat</td>
					<td>Mark</td>
					<td>Otto</td>
					<td>@mdo</td>
				</tr>
				<tr>
					<th scope="row">3</th>
					<td>Larry</td>
					<td>the Bird</td>
					<td>@twitter</td>
					<td>Mark</td>
					<td>Otto</td>
					<td>@mdo</td>
				</tr>
			</tbody>
		</table>

		</form>
	</div>
</body>
</html>