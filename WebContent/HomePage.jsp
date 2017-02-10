<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Zoom Car</title>
<script type="text/javascript"
	src="jquery-3.1.1.js"></script>
<script type="text/javascript"
	src="//cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="//cdn.datatables.net/1.10.13/css/jquery.dataTables.min.css" />
<script type="text/javascript">
	$(document).ready(function() {
		$('#myTable').DataTable( {
	        "ordering": true,
	        "pageLength": 12,
	        "info":     false,
	        "stateSave" : true
	    });
	});
</script>
</head>
<body>
	<table id="myTable" style="width: 100%; text-align: center;" border="1">
		<thead>
			<th>Image</th>
			<th>Name</th>
			<th>Type</th>
			<th>Hourly Rate</th>
			<th>Rating</th>
			<th>Seater</th>
			<th>Ac</th>
			<th>Latitude</th>
			<th>Longitude</th>
		</thead>
		<tbody>
			<s:iterator status="stat" value="carsList.cars" var="list">
				<tr><s:set var="fileType" value="%{#list.type}" />
					<td><img src="<s:url value="%{#list.image}"/>" /></td>
					<td><s:property value="%{#list.name}" /></td>
					<td><s:property value="%{#list.type}" /></td>
					<td><s:property value="%{#list.hourly_rate}" /></td>
					<td><s:property value="%{#list.rating}" /></td>
					<td><s:property value="%{#list.seater}" /></td>
					<td><s:property value="%{#list.ac}" /></td>
					<td><s:property value="%{#list.location.latitude}" /></td>
					<td><s:property value="%{#list.location.longitude}" /></td>
					
				</tr>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>