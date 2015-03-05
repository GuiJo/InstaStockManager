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
        <h1>Inscription Pro</h1>
        
        <form:form action="" method="post" modelAttribute="user">
           
            <form:label path="siret">Siret :</form:label><br>
            <form:input path="siret"/><br>
            <form:label path="email">Email :</form:label><br>
            <form:input path="email"/><br>
            <form:label path="adresse">Adresse :</form:label><br>
            <form:input path="adresse"/><br>
            <form:label path="telephone">Telephone :</form:label><br>
            <form:input path="telephone"/><br>
             <form:label path="ville">Ville :</form:label><br>
            <form:input path="ville"/><br>
           
            <input type="submit" value="Valider" />
        </form:form>
        
    </body>
</html>
