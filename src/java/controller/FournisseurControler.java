/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoGeneric;
import factory.FactoryDao;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.metier.Client;
import model.metier.Fournisseur;
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
//@RequestMapping("/pro")
public class FournisseurControler {
    
    
     private FactoryDao factoryDao;

    public FactoryDao getFactoryDao() {
        return factoryDao;
    }
    @Autowired
    public void setFactoryDao(FactoryDao factoryDao) {
        this.factoryDao = factoryDao;
    }
    
      @RequestMapping("/LesFournisseurs")
    public String allFournisseurs(Model m) {
        DaoGeneric dao = factoryDao.getDao(Fournisseur.class);
        List<Fournisseur> l = dao.selectAll(Fournisseur.class);
        m.addAttribute("myList", l);
        return "listFournisseurs";
    }
    
     @RequestMapping(value = "/inscriptionfournisseur", method = RequestMethod.GET)
    public String insert(Model model) {

        model.addAttribute("user", new Fournisseur());
        return "inscriptionFournisseur";
    }

    @RequestMapping(value = "/inscriptionfournisseur", method = RequestMethod.POST)
    public String insert(@ModelAttribute(value = "user") Fournisseur user) {
        DaoGeneric dao = factoryDao.getDao(Fournisseur.class);
        dao.insert(user);
        return "index1";

    }
    
    @RequestMapping(value = "/modificationfournisseur", method = RequestMethod.GET)
    public String update(Model model, HttpServletRequest request) {
        
        String ids = request.getParameter("id");
        int id = 0;
        try {
            id = Integer.parseInt(ids);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        DaoGeneric dao = factoryDao.getDao(Fournisseur.class);
        Client client = (Client) dao.SelectById(Fournisseur.class,id);
        model.addAttribute("user", client);
        return "index";
    }

    @RequestMapping(value = "/modificationfournisseur", method = RequestMethod.POST)
    public String update(@ModelAttribute(value = "user") Client user) {
        DaoGeneric dao = factoryDao.getDao(Client.class);
        dao.update(user);
        return "index";
    }
    
     @RequestMapping(value = "/suppressionfournisseur", method = RequestMethod.POST)
    public String delete(@ModelAttribute(value = "user") Client user) {
        DaoGeneric dao = factoryDao.getDao(Fournisseur.class);
        dao.delete(user);
        return "index";
    }
    
      
}
