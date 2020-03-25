<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="header">
	<div class="headeranh">
		<img src="resources/images/home.png" alt=""
			style="margin-left: 50px; float: left;">
		<h2>Phòng Trọ Giá Rẻ Hà Nội</h2>
	</div>
	<div class="headermenu">
		<%-- 	<ul style="background: #33CC66">
			<li>
				<div class="dropdown show">
					<a class="btn btn-secondary dropdown-toggle" href="#" role="button"
						id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false">Loại Phòng</a>

					<div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
					<c:forEach items="${loaiphong}" var="list">
						<a class="dropdown-item" href="#">${list.getTenloaiphong()}</a> 
					</c:forEach>
					</div>
				</div>

			</li>
			<li><a href="tintuc"><b>Tin Tức</b></a></li>
			<c:if test="${empty user}">
				<li><a href="login"><b>Login</b></a></li>
			</c:if>
			<c:if test="${not empty user}">
				<li><a href="trangcanhan"><b>Tai khoan</b></a></li>
			</c:if>
			<li><a href="tranghome"><b>Trang Chủ</b></a></li>
		</ul> --%>

		<ul class="a1">
			<li><a href="tintuc">Tin Tức</a></li>
			<li><a href="#">Loại Phòng</a>
				<ul class="a2">
					<c:forEach items="${loaiphong}" var="list">						
						<li><a href="loaiphonghome?id=${list.getMaloaiphong()}">${list.getTenloaiphong()}</a></li> 
					</c:forEach>
					
				</ul>
			</li>
				
			<c:if test="${empty user}">
				<li><a href="login"><b>Login</b></a></li>
			</c:if>
			<c:if test="${not empty user}">
				<li><a href="trangcanhan"><b>Tai khoan</b></a></li>
			</c:if>
			<li><a href="tranghome">Trang chủ</a></li>
		</ul>
	</div>
</div>