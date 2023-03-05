<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>

<script src="http://lab.alexcican.com/set_cookies/cookie.js" type="text/javascript" ></script>
</head>
<body>

<form action="loginAf.do" method="post">
<div align="center">
Id<input type="text" id="id" name="id">
</div>
<div align="center">
Password<input type="text" id="pwd" name="pwd">
</div>
<button type="submit" >login</button>
<a href="#" onclick="account()">회원가입</a>
</form>

<script type="text/javascript">
function account() {
	location.href = "regi.do";
}
</script>
</body>
</html>