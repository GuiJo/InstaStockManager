/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoGeneric;
import factory.FactoryDao;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import model.metier.Categorie;
import model.metier.Client;
import model.metier.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author johancarriel
 */
@Controller
//@RequestMapping("/pro")
public class ProduitController {

    private FactoryDao factoryDao;

    public FactoryDao getFactoryDao() {
        return factoryDao;
    }

    @Autowired
    public void setFactoryDao(FactoryDao factoryDao) {
        this.factoryDao = factoryDao;
    }

    @RequestMapping("/LesProd")
    public String allProduits(Model m) {
        DaoGeneric dao = factoryDao.getDao(Produit.class);
        List<Produit> l = dao.selectAll(Produit.class);
        m.addAttribute("myList", l);
        return "listProd";
    }

    @RequestMapping(value = "/ajoutProd", method = RequestMethod.GET)
    public String insert(Model model) {

        model.addAttribute("produit", new Produit());
        return "ajoutProd";
    }

    @RequestMapping(value = "/ajoutProd", method = RequestMethod.POST)
    public String insert(@ModelAttribute(value = "produit") Produit produit) {
        DaoGeneric dao = factoryDao.getDao(Produit.class);
        dao.insert(produit);
        return "index1";

    }

    @RequestMapping(value = "/modificationprod", method = RequestMethod.GET)
    public String update(Model model, HttpServletRequest request) {

        String ids = request.getParameter("id");
        int id = 0;
        try {
            id = Integer.parseInt(ids);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        DaoGeneric dao = factoryDao.getDao(Produit.class);
        Client client = (Client) dao.SelectById(Produit.class, id);
        model.addAttribute("produit", client);
        return "index";
    }

    @RequestMapping(value = "/modificationprod", method = RequestMethod.POST)
    public String update(@ModelAttribute(value = "produit") Produit produit) {
        DaoGeneric dao = factoryDao.getDao(Client.class);
        dao.update(produit);
        return "index";
    }

    @RequestMapping(value = "/suppressionprod", method = RequestMethod.POST)
    public String delete(@ModelAttribute(value = "produit") Produit produit) {
        DaoGeneric dao = factoryDao.getDao(Produit.class);
        dao.delete(produit);
        return "index";
    }

    @ModelAttribute(value = "listCategories")
    protected List getListCategories() {
        DaoGeneric dao = factoryDao.getDao(Categorie.class);

        return dao.selectAll(Categorie.class);

    }

}
