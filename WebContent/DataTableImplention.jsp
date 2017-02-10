<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Zoom Car</title>
<script type="text/javascript"
	src="//cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="//cdn.datatables.net/1.10.13/css/jquery.dataTables.min.css" />
<script type="text/javascript">
	$(document).ready(function() {
		$('#myTable').DataTable({
	        data: dataSet,
	        columns: [
	            { title: "Name" },
	            { title: "Position" },
	            { title: "Office" },
	            { title: "Extn." },
	            { title: "Start date" },
	            { title: "Salary" }
	        ]
	    });
	});
</script>
</head>
<body>

</body>
</html>