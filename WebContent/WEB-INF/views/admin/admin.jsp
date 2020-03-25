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
		<input type="text" id="myInput" onkeyup="myFunction()"
			placeholder="Tìm Kiếm ....." title="Type in a name">
		<a href="adminthem">Thêm mới</a>
		<table class="table table-striped table-dark" id="myTable"
			style="margin-top: 100px">
			<thead>
				<tr>
					<th scope="col">STT</th>
					<th scope="col">Mã QT</th>
					<th scope="col">Họ Tên</th>
					<th scope="col">Số điện thoại</th>
					<th scope="col">Pass</th>
					<th scope="col">Địa Chỉ</th>
					<th scope="col">Email</th>

				</tr>
			</thead>
			<tbody>

				<c:forEach items="${listqt}"  var="ds">
			
					<tr>
						<th scope="row"></th>
						<td>${ds.getMaqt()}</td>
						<td>${ds.getHoten()}</td>
						<td>${ds.getSdt()}</td>
						<td>${ds.getPass()}</td>
						<td>${ds.getDiachi()}</td>
						<td>${ds.getEmail()}</td>
						
<!-- 						<td><img src="images/anhphong1.jpg" alt=""
							style="width: 150px; height: 150px;"></td>
						<td>@mdo</td> -->
						<td><a href="xoaadmin?id=${ds.getMaqt()}">Xóa</a><a href="adminsua?id=${ds.getMaqt()}">Sửa</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		</form>
		<script type="text/javascript">
		function myFunction() {
			  var input, filter, table, tr, td, i, txtValue;
			  input = document.getElementById("myInput");
			  filter = input.value.toUpperCase();
			  table = document.getElementById("myTable");
			  tr = table.getElementsByTagName("tr");
			  for (i = 0; i < tr.length; i++) {
			    td = tr[i].getElementsByTagName("td")[0];
			    if (td) {
			      txtValue = td.textContent || td.innerText;
			      if (txtValue.toUpperCase().indexOf(filter) > -1) {
			        tr[i].style.display = "";
			      } else {
			        tr[i].style.display = "none";
			      }
			    }       
			  }
			}
		</script>
	</div>
</body>
</html>