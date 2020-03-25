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
		<form action="adminthem" method="post">

			<div class="form-group">
				<label for="formGroupExampleInput">Họ Tên</label> <input type="text"
					class="form-control"  name="hoten">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">Số Điện Thoại</label> <input
					type="text" class="form-control" 
					name="sdt">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">Email</label> <input type="text"
					class="form-control"  name="email">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">Địa Chỉ</label> <input
					type="text" class="form-control" 
					name="diachi">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">PassWord</label> <input
					type="password" class="form-control" 
					name="pass">
			</div>
			

			<input type="submit" value="Thêm mới"
				style="background: #088A08; margin-left: 40%">


		</form>
	</div>

</body>
</html>