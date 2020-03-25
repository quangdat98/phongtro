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
		<form action="suakh" method="post">


			<div class="form-group">
				<label for="formGroupExampleInput2">Mã Quản Trị</label> <input readonly="readonly"
					type="text" class="form-control" value="${kh.getMakh()}" name="makh"
					name="ghichu">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput">Họ Tên</label> <input type="text"
					class="form-control" value="${kh.getHoten()}" name="hoten">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">Số Điện Thoại</label> <input
					type="text" class="form-control" value="${kh.getSdt()}"
					name="sdt">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">Email</label> <input type="text"
					class="form-control" value="${kh.getEmail()}" name="email">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">Địa Chỉ</label> <input
					type="text" class="form-control" value="${kh.getDiachi()}"
					name="diachi">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">PassWord</label> <input
					type="password" class="form-control" value="${kh.getPass()}"
					name="pass">
			</div>
				<div class="form-group">
				<label for="formGroupExampleInput2">Ghi Chú</label> <input
					type="password" class="form-control" value="${kh.getGhichu()}"
					name="ghichu">
			</div>
			

			<input type="submit" value="Sửa"
				style="background: #088A08; margin-left: 40%">


		</form>
	</div>

</body>
</html>