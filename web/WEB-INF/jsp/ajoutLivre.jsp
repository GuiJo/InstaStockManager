<%-- 
    Document   : newjspajoutLivre
    Created on : 27 févr. 2015, 11:00:31
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
       
     
        <form:form action="" method="post" modelAttribute="livre">
            <form:label path="annee">annee :</form:label><br>
            <form:input path="annee"/><br>
            
            <form:label path="condense">condense :</form:label><br>
            <form:input path="condense"/><br>
            
            <form:label path="nbPages">nbPages :</form:label><br>
            <form:input path="nbPages"/><br>
            
            <form:label path="prix">prix :</form:label><br>
            <form:input path="prix"/><br>
            
            <form:label path="couverture">couverture :</form:label><br>
            <form:input path="couverture"/><br>
            
            <form:label path="auteurs">Auteurs :</form:label><br>
            <form:select itemLabel="nomAuteur" itemValue="" items="${lAuteurs}" path="editeurs.idEditeur"/>
            
             <form:label path="editeurs">Editeurs :</form:label><br>
            <form:select itemLabel="nomEditeur" itemValue="" items="${lEditeurs}" path="auteurs.idAuteur"/>
            
            
            <input type="submit" value="Valider" />
        </form:form>
        
    </body>
</html>
