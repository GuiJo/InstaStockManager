/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoGeneric;
import dao.DaoProduit;
import factory.FactoryDao;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.metier.Client;
import model.metier.Metier;
import model.metier.Commande;
import model.metier.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author johancarriel
 */
@Controller
//@RequestMapping("/particulier")
public class CommandeController {
    
    
     private FactoryDao factoryDao;

    public FactoryDao getFactoryDao() {
        return factoryDao;
    }
    @Autowired
    public void setFactoryDao(FactoryDao factoryDao) {
        this.factoryDao = factoryDao;
    }
    
      @RequestMapping("/LesCom")
    public String allCommandes(Model m) {
        DaoGeneric dao = factoryDao.getDao(Commande.class);
        List<Commande> l = dao.selectAll(Commande.class);
        m.addAttribute("myList", l);
        return "listCommandes";
    }
    
     @RequestMapping(value = "/ajoutCom", method = RequestMethod.GET)
    public String insert(Model model) {

        model.addAttribute("commande", new Commande());
        return "ajoutCom";
    }

    @RequestMapping(value = "/ajoutCom", method = RequestMethod.POST)
    public String insert(@ModelAttribute(value = "commande") Commande commande) {
        DaoGeneric dao = factoryDao.getDao(Commande.class);
        Produit p1 =  commande.getProduit();
        int currQte = p1.getQuantite();
        int cmdQte = commande.getQuantite();
       p1.setQuantite(currQte - cmdQte);
        dao.insert(commande);
        
        
        /*Produit p = commande.getProduit();
        DaoGeneric daop = factoryDao.getDao(Produit.class);
        Produit p1 = (Produit) daop.SelectById(Produit.class, p.getId());
        int currQte = p1.getQuantite();
        int cmdQte = commande.getQuantite();
        p1.setQuantite(currQte - cmdQte);
        daop.update(p1);*/
        return "index1";

    }
    
    @RequestMapping(value = "/modificationCom", method = RequestMethod.GET)
    public String update(Model model, HttpServletRequest request) {
        
        String ids = request.getParameter("id");
        int id = 0;
        try {
            id = Integer.parseInt(ids);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        DaoGeneric dao = factoryDao.getDao(Commande.class);
        Client client = (Client) dao.SelectById(Commande.class,id);
        model.addAttribute("commande", client);
        return "index";
    }

    @RequestMapping(value = "/modificationCom", method = RequestMethod.POST)
    public String update(@ModelAttribute(value = "commande") Commande commande) {
        DaoGeneric dao = factoryDao.getDao(Client.class);
        dao.update(commande);
        return "index";
    }
    
     @RequestMapping(value = "/suppressionCom", method = RequestMethod.POST)
    public String delete(@ModelAttribute(value = "commande") Commande commande) {
        DaoGeneric dao = factoryDao.getDao(Commande.class);
        dao.delete(commande);
        return "index";
    }
    
        @ModelAttribute(value = "listClients")
    public List<Client> getAllClients() {
        DaoGeneric dao = factoryDao.getDao(Client.class);

        return dao.selectAll(Client.class);
    }
    
       @ModelAttribute(value = "listProduits")
    public List<Produit> getAllProduits() {
        DaoGeneric dao = factoryDao.getDao(Produit.class);

        return dao.selectAll(Produit.class);
    }
      
}
