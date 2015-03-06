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
               
   
        <li><a href="#">Liste des catégories</a></li>
    </ul>

    <div class="row-fluid sortable">		

        <table class="table table-striped table-bordered bootstrap-datatable datatable">
            <thead>
                <tr>
                    <th>Id Catégorie</th>
                    <th>Nom</th>
                </tr>
            </thead>   
            <tbody>
                <c:forEach items="${myList}" var="element"> 
                    <tr>
                        <td>${element.id}</td>
                      
                        <td class="center">${element.nom}</td>
                       
                    </tr>
                </c:forEach>
            </tbody>
        </table>            		
    </div><!--/row-->
    </section><! --/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
   
    
  </section>
    <%@include file="includes/footer.jsp" %>



