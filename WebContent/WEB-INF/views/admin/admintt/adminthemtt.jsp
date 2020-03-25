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
		<form action="themtt" method="post">
			
			<br/>

			<div class="form-group">
				<label for="formGroupExampleInput2">Tiêu Đề</label> <input
					type="text" class="form-control"  name="tieude"
					name="ghichu">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput">Mô Tả</label> <input type="text"
					class="form-control"  name="mota">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">Nội Dung</label> <input
					type="text" class="form-control" name="noidung">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">Mã QT</label> <input type="text"
					class="form-control"  name="maqt">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">Địa Chỉ</label> <input
					type="file" class="form-control" name ="anh"
					name="diachi">
			</div>

			<input type="submit" value="Thêm"
				style="background: #088A08; margin-left: 40%">


		</form>
	</div>

</body>
</html>