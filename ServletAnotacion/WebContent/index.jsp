<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTM 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ejercicio DoPost</title>
<style>

body{
background: black;

}

.login{
  width: 360px;
  padding: 6% 0 0;
  margin: auto;
}

.form {
  position: relative;
  max-width: 360px;
  margin: 0 auto 100px;
  padding: 30px;
  text-align: center;
  background: #FFFFFF;
}

.form input {
  background: #f2f2f2;
  width: 100%;
  border: 0;
  margin: 0 0 15px;
  padding: 15px;
  box-sizing: border-box;
  font-size: 14px;
}
.form button {
  text-transform: uppercase;
  outline: 0;
  background: black;
  width: 100%;
  border: 0;
  padding: 15px;
  color: #FFFFFF;
  font-size: 14px;
  border-radius: 12px;
  font-weight: bold
}

</style>
</head>
<body>
	<div class="login">
		<div class="form">
			<form action="AnotacionServlet" method="post" class="form-login">
				<input name="usuario" type="text" placeholder="User">
				<input name="clave" type="password" placeholder="Password">
				<button type="submit" value="Validar">Validar</button>
			</form>
		</div>
	</div>
</body>
</html>