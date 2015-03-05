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
               
   
        <li><a href="#">Liste des prof</a></li>
    </ul>

    <div class="row-fluid sortable">		

        <table class="table table-striped table-bordered bootstrap-datatable datatable">
            <thead>
                <tr>
                    <th>Id Particuliers</th>
                   
                    <th>siret</th>
                    <th>email</th>
                    <th>Adresse</th>
                    <th>Ville</th>
                    <th>Telephone</th>
                </tr>
            </thead>   
            <tbody>
                <c:forEach items="${myList}" var="element"> 
                    <tr>
                        <td>${element.id}</td>
                      
                        <td class="center">${element.siret}</td>
                        <td class="center">${element.email}</td>
                        <td class="center">
                            ${element.adresse} 
                        </td>
                        <td class="center">${element.ville} </td>
                        <td class="center">${element.telephone}</td>
                       
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



