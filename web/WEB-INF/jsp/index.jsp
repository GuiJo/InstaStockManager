<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insta Stock Manager</title>
    </head>

    <body>
    <nav>
        <ul>
            <li><a href="<%=request.getContextPath()%>/user/login.htm">Login</a></li>
            <li><a href="<%=request.getContextPath()%>/user/inscription.htm">Inscription</a></li>
            <li><a href="<%=request.getContextPath()%>/livre/livres.htm">Les livres</a></li>
            <li><a href="<%=request.getContextPath()%>/livre/ajout.htm">Ajouter un livre</a></li>
        </ul>
    </nav>
        <p>${user.nom}</p>
    </body>
</html>
