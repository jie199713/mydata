<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"  %>
<html>
<body>
	Hello World!
</body>
<script type="text/javascript" src="jquery-1.11.0.js"></script>
<script type="text/javascript">
	$.ajax({
		type:"get", 
		data:"???????????????",
		url:"login",
		async:true,
		success:function(data){
			console.log(data);
		}
	});
</script>
</html>
