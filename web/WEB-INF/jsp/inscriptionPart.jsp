<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="includes/header.jsp" %>
<%@include file="includes/menu.jsp" %>

<!-- start: Content -->

<body>

  <section id="container" >
      
      <!-- **********************************************************************************************************************************************************
      
      
      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper site-min-height">
               
   
        <h1>Inscription</h1>
        
        <form:form action="" method="post" modelAttribute="user">
            
            <form:label path="nom">Nom :</form:label><br>
            
            <div class="controls"><form:input path="nom"/></div>
            <form:label path="prenom">Prénom :</form:label><br>
            <form:input path="prenom"/><br>
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
        
   </section><! --/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
   
    
  </section>
    <%@include file="includes/footer.jsp" %>




