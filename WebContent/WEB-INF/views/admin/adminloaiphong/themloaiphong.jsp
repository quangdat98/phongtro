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
		</p>

		<form action="themloaiphong" method="post">
			
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">Tên Loại Phòng</label> <input type="text" name="tenloaiphong"
						class="form-control" >
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Mô Tả</label> <input type="text"
						name="mota" class="form-control" >
				</div>
			</div>

			<button type="submit" class="btn btn-primary">Thêm Mới</button>
		</form>
	</div>

</body>
</html>