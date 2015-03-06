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
import model.metier.Professionnel;
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
public class ProController {
    
    
     private FactoryDao factoryDao;

    public FactoryDao getFactoryDao() {
        return factoryDao;
    }
    @Autowired
    public void setFactoryDao(FactoryDao factoryDao) {
        this.factoryDao = factoryDao;
    }
    
      @RequestMapping("/LesPro")
    public String allProfessionnels(Model m) {
        DaoGeneric dao = factoryDao.getDao(Professionnel.class);
        List<Professionnel> l = dao.selectAll(Professionnel.class);
        m.addAttribute("myList", l);
        return "listProfessionnels";
    }
    
     @RequestMapping(value = "/inscriptionpro", method = RequestMethod.GET)
    public String insert(Model model) {

        model.addAttribute("user", new Professionnel());
        return "inscriptionPro";
    }

    @RequestMapping(value = "/inscriptionpro", method = RequestMethod.POST)
    public String insert(@ModelAttribute(value = "user") Professionnel user) {
        DaoGeneric dao = factoryDao.getDao(Professionnel.class);
        dao.insert(user);
        return "index1";

    }
    
    @RequestMapping(value = "/modificationpro", method = RequestMethod.GET)
    public String update(Model model, HttpServletRequest request) {
        
        String ids = request.getParameter("id");
        int id = 0;
        try {
            id = Integer.parseInt(ids);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        DaoGeneric dao = factoryDao.getDao(Professionnel.class);
        Client client = (Client) dao.SelectById(Professionnel.class,id);
        model.addAttribute("user", client);
        return "index";
    }

    @RequestMapping(value = "/modificationpro", method = RequestMethod.POST)
    public String update(@ModelAttribute(value = "user") Client user) {
        DaoGeneric dao = factoryDao.getDao(Client.class);
        dao.update(user);
        return "index";
    }
    
     @RequestMapping(value = "/suppressionpro", method = RequestMethod.POST)
    public String delete(@ModelAttribute(value = "user") Client user) {
        DaoGeneric dao = factoryDao.getDao(Professionnel.class);
        dao.delete(user);
        return "index";
    }
    
      
}
