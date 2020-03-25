<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/login.css">
</head>
<body>
	<div class="bgc"></div>
	<div class="frameLogin">

		<img src="resources/images/user.png" width="150px" id="imgUser" />
		<h3>Sign in here</h3>
		<form action="kiemtra" method="post">
			<div class="input">
				<span>
					<i class="fa fa-user"></i>
				</span>
				<input type="text" id="user" name="email" placeholder="Username" required />
			</div>
			<br>
			<div class="input">
				<span>
					<i class="fa fa-lock"></i>
				</span>
				<input type="password" id="pass" name="pass" placeholder="Password" required>
			</div>
			<br>
			<button type="submit" id="btLogin">Đăng nhập</button>
			<br>
			<a href="dangky">Đăng Ký Tài Khoản</a><br/>
		</form>
	</div>
<script type="text/javascript">
	var a ='${loi}';
	if(a != null){
			alert("Bạn Đã Nhập sai!!");
		}
	
</script>
</body>
</html>