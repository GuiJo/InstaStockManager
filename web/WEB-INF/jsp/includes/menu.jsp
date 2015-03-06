
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- start: Header -->

    <!--sidebar start-->
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu" id="nav-accordion">
              
              	  <p class="centered"><a href="profile.html"><img src="assets/img/ui-sam.jpg" class="img-circle" width="60"></a></p>
              	  <h5 class="centered">Bonjour Mr Johan CARRIEL</h5>
              	  	
                  <li class="mt">
                      <a href="index.html">
                          <i class="fa fa-dashboard"></i>
                          <span>Dashboard</span>
                      </a>
                  </li>

                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class="fa fa-desktop"></i>
                          <span>Clients Pro ou Particuliers</span>
                      </a>
                      <ul class="sub">
                          <li><a  href="<%=request.getContextPath()%>/inscription.htm">Nouveau Particulier</a></li>
                          <li><a  href="<%=request.getContextPath()%>/inscriptionpro.htm">Nouveau Professionnel</a></li>
                          <li><a  href="<%=request.getContextPath()%>/inscriptionemp.htm">Nouvel Employé</a></li>
                          <li><a  href="<%=request.getContextPath()%>/inscriptionfournisseur.htm">Nouveau Fournisseur</a></li>
                          <br/>
                          <li><a  href="<%=request.getContextPath()%>/LesParticuliers.htm">Liste des Particuliers</a></li>
                          <li><a  href="<%=request.getContextPath()%>/LesPro.htm">Liste des Professionnels</a></li>
                          <li><a  href="<%=request.getContextPath()%>/LesEmployes.htm">Liste des Employes</a></li>
                          <li><a  href="<%=request.getContextPath()%>/LesFournisseurs.htm">Liste des Fournisseurs</a></li>
                          <li><a  href="panels.html">Supprimer un utilisateur</a></li>
                      </ul>
                  </li>
                  
                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class="fa fa-desktop"></i>
                          <span>Produits</span>
                      </a>
                      <ul class="sub">
                          <li><a  href="<%=request.getContextPath()%>/ajoutCat.htm">Ajouter Catégorie</a></li>
                          <li><a  href="<%=request.getContextPath()%>/ajoutProd.htm">Ajouter Produit</a></li>
                          <br/>
                          <li><a  href="<%=request.getContextPath()%>/LesCat.htm">Liste des Catégories</a></li>
                          <li><a  href="<%=request.getContextPath()%>/LesProd.htm">Liste des Produits</a></li>
                      </ul>
                  </li>

                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class="fa fa-cogs"></i>
                          <span>Commande</span>
                      </a>
                      <ul class="sub">
                          <li><a  href="calendar.html">Passer une commande</a></li>
                          <li><a  href="gallery.html">Lister les commandes</a></li>
                          <li><a  href="todo_list.html">Supprimer une commande</a></li>
                      </ul>
                  </li>
                   <li class="mt">
                      <a href="index.html">
                          <i class="fa fa-dashboard"></i>
                          <span>Impression d'une facture (PDF)</span>
                      </a>
                  </li>
                
              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>
      <!--sidebar end-->
      <!-- start: JavaScript-->
<!--common script for all pages-->
    <script src="assets/js/common-scripts.js"></script>

    <!--script for this page-->
    
  <script>
      //custom select box

      $(function(){
          $('select.styled').customSelect();
      });

  </script>
<!-- js placed at the end of the document so the pages load faster -->
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/jquery-ui-1.9.2.custom.min.js"></script>
    <script src="assets/js/jquery.ui.touch-punch.min.js"></script>
    <script class="include" type="text/javascript" src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="assets/js/jquery.scrollTo.min.js"></script>
    <script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>

<!-- end: JavaScript-->