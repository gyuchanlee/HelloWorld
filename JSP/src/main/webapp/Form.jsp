<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>
  <form name="myform" action="formServlet" method="post" enctype="multipart/form-data">
    <input type="text" name="user"><br>
    <input type="text" name="pw"><br>
    <input type="file" name="img"><br>
    <input type="hidden" name="cmd" value="search">
    <input type="hidden" name="name">
    <input type="hidden" name="age">
    <input type="submit" value="전송">
  </form>
  
  <form name="my">
  
  </form>
  
  <script>
    let myform = document.forms.my;
    myform.onsubmit = function() {
    	myform.action = "sample.html";
    	myform.cmd.value = "insert";
    	myform.user.value = "admin";
    	myform.pw.value = "1234";
    	myform.name.value = "Lee";
    	myform.age.value = "12";
    }
  </script>
</body>
</html>