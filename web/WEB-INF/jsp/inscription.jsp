<%-- 
    Document   : inscription
    Created on : 27 févr. 2015, 10:25:30
    Author     : userinsta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Inscription</h1>
        
        <form:form action="" method="post" modelAttribute="user">
            <form:label path="nom">Nom :</form:label><br>
            <form:input path="nom"/><br>
            <form:label path="prenom">Prénom :</form:label><br>
            <form:input path="prenom"/><br>
            <form:label path="email">Email :</form:label><br>
            <form:input path="email"/><br>
            <form:label path="mdp">Password :</form:label><br>
            <form:password path="mdp"/><br>
            <form:label path="villes">Ville :</form:label><br>
            <form:select itemLabel="nomVille" itemValue="cp" items="${lVilles}" path="villes.cp"/>
            <input type="submit" value="Valider" />
        </form:form>
        
    </body>
</html>
