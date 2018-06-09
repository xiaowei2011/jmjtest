<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test page</title>
</head>
<body>
	a:<input type="text" name="a" /><br/>
	<input type="button" id="btn-calc" value="计算"/>
	<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript">
		$("#btn-calc").click(function(){
			var a = parseInt($(":text[name='a']").val());
			console.log("a:" + a);
			$.post("test", {a:a}, function(data){
				console.log(a + " / " +data.b + " = " + data.c);
				alert(data.c);
			},"json");
		});
	</script>
</body>
</html>