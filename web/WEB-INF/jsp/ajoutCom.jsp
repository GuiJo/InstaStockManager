<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="includes/header.jsp" %>
<%@include file="includes/menu.jsp" %>

<!-- start: Content -->

<!--main content start-->
<section id="main-content">
    <section class="wrapper">
        <h3><i class="fa fa-angle-right"></i>Ajout commande</h3>

        <!-- BASIC FORM ELELEMNTS -->
        <div class="row mt">
            <div class="col-lg-12">
                <div class="form-panel">
                    <h4 class="mb"><i class="fa fa-angle-right"></i> Form Elements</h4>

                    <form:form action="" class="form-horizontal style-form" method="post" modelAttribute="commande">

                        <div class="form-group">
                            <form:label path="date" class="col-sm-2 col-sm-2 control-label">Date :</form:label><br>
                                <div class="col-sm-10">
                                <form:input path="date" class="form-control"/>
                            </div>
                        </div>
                            
                        <div class="form-group">
                            <form:label path="produit" class="col-sm-2 col-sm-2 control-label">Produit :</form:label><br>
                                <div class="col-sm-10">
                                <form:select itemLabel="nom" itemValue="id" items="${listProduits}" path="produit.id"/>
                            </div>
                        </div>
                            
                            <div class="form-group">
                            <form:label path="quantite" class="col-sm-2 col-sm-2 control-label">Quantite :</form:label><br>
                                <div class="col-sm-10">
                                <form:input path="quantite" class="form-control"/>
                            </div>
                        </div>
                            
                        <div class="form-group">
                            <form:label path="client" class="col-sm-2 col-sm-2 control-label">Client :</form:label><br>
                                <div class="col-sm-10">
                                <form:select itemLabel="id" itemValue="id" items="${listClients}" path="client.id"/>
                            </div>
                        </div>
                        


                <input type="submit" value="Valider" />
            </form:form>
        </div>
        </div><!-- col-lg-12-->      	
        </div><!-- /row -->



    </section><! --/wrapper -->
</section><!-- /MAIN CONTENT -->
<%@include file="includes/footer.jsp" %>

