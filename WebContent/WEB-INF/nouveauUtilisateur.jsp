<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="">
	<p>
    	<label for="nom">Votre Nom</label><br />
   		<input type="text" name="nom" id="nom" />
    </p>
    <p>
        <label for="prenom">Votre prénom :</label><br />
        <input type="text" name="prenom" id="prenom" />
    </p>
    <p>
        <label for="prenom">Votre mail:</label><br />
        <input type="text" name="mail" id="mail" />
    </p>
    <p>
        <input type="submit" value="Valider" />
        <input type="reset" value="Remettre à zéro" />
	</p>
	<input type="hidden" name="utilisateurcache">
    </form>
</body>
</html>