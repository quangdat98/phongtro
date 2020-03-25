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
					<th scope="col">Mã Phòng</th>
					<th scope="col">Địa Chỉ</th>
					<th scope="col">Mô Tả</th>
					<th scope="col">Diện Tích</th>
					<th scope="col">Giá</th>
					<th scope="col">ảnh</th>
					<th scope="col">Mã Loại Phòng</th>
					<th scope="col">Công Cụ</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${list}"  var="ds">
			
					<tr>
						<th scope="row"></th>
						<td>${ds.getMaphong()}</td>
						<td>${ds.getDiachi()}</td>
						<td>${ds.getMota()}</td>
						<td>${ds.getDientich()}</td>
						<td>${ds.getGia()}</td>
						<td>${ds.getMaloaiphong()}</td>
 						<td><img src="${ds.getAnh()}" alt=""
							style="width: 150px; height: 150px;"></td>
						
						<td><a href="xoaphong?id=${ds.getMaphong()}">Xóa</a><a href="suaphong?id=${ds.getMaphong()}">Sửa</a></td>
					</tr>
				</c:forEach>
		
			</tbody>
		</table>

		</form>
	</div>
</body>
</html>