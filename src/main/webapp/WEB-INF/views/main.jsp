<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

<div align="center">

<table style="width: 1000px; height: 800px; border-color: gray;" >

<!-- header  주석 추가-->
<tr align="left" style="background-color: gray;color: white;">
		<td colspan="7" style="height: 5%">
			<tiles:insertAttribute name="header"/>
		</td>
	
</tr>

<!-- main -->
<tr>
	<td align="left" valign="top" style="background-color: rgb(204,204,204); width: 20%">
		<tiles:insertAttribute name="menu"/>
	</td>
	<td>
		<tiles:insertAttribute name="content"/>
	</td>
	
</tr>

<!-- footer -->
<tr align="center" style="background-color: black;color: white;">
	<td colspan="3" style="height: 10%">
		<tiles:insertAttribute name="footer"/>
	</td>
</tr>

	<p>git Test</p>


</table>

</div>

</body>
</html>






