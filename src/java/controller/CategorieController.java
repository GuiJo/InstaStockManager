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
import model.metier.Metier;
import model.metier.Categorie;
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
public class CategorieController {
    
    
     private FactoryDao factoryDao;

    public FactoryDao getFactoryDao() {
        return factoryDao;
    }
    @Autowired
    public void setFactoryDao(FactoryDao factoryDao) {
        this.factoryDao = factoryDao;
    }
    
      @RequestMapping("/LesCat")
    public String allCategories(Model m) {
        DaoGeneric dao = factoryDao.getDao(Categorie.class);
        List<Categorie> l = dao.selectAll(Categorie.class);
        m.addAttribute("myList", l);
        return "listCategories";
    }
    
     @RequestMapping(value = "/ajoutCat", method = RequestMethod.GET)
    public String insert(Model model) {

        model.addAttribute("categorie", new Categorie());
        return "ajoutCat";
    }

    @RequestMapping(value = "/ajoutCat", method = RequestMethod.POST)
    public String insert(@ModelAttribute(value = "categorie") Categorie categorie) {
        DaoGeneric dao = factoryDao.getDao(Categorie.class);
        dao.insert(categorie);
        return "index1";

    }
    
    @RequestMapping(value = "/modificationCat", method = RequestMethod.GET)
    public String update(Model model, HttpServletRequest request) {
        
        String ids = request.getParameter("id");
        int id = 0;
        try {
            id = Integer.parseInt(ids);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        DaoGeneric dao = factoryDao.getDao(Categorie.class);
        Client client = (Client) dao.SelectById(Categorie.class.toString(),id);
        model.addAttribute("categorie", client);
        return "index";
    }

    @RequestMapping(value = "/modificationCat", method = RequestMethod.POST)
    public String update(@ModelAttribute(value = "categorie") Categorie categorie) {
        DaoGeneric dao = factoryDao.getDao(Client.class);
        dao.update(categorie);
        return "index";
    }
    
     @RequestMapping(value = "/suppressionCat", method = RequestMethod.POST)
    public String delete(@ModelAttribute(value = "categorie") Categorie categorie) {
        DaoGeneric dao = factoryDao.getDao(Categorie.class);
        dao.delete(categorie);
        return "index";
    }
    
      
}
