/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoGeneric;
import factory.FactoryDao;
import javax.servlet.http.HttpServletRequest;
import model.metier.Client;
import model.metier.Particulier;
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
@RequestMapping("particulier")
public class ParticulierController {
    
    
     private FactoryDao factoryDao;

    public FactoryDao getFactoryDao() {
        return factoryDao;
    }
    @Autowired
    public void setFactoryDao(FactoryDao factoryDao) {
        this.factoryDao = factoryDao;
    }
    
    
     @RequestMapping(value = "/inscription", method = RequestMethod.GET)
    public String insert(Model model) {

        model.addAttribute("user", new Particulier());
        return "inscription";
    }

    @RequestMapping(value = "/inscription", method = RequestMethod.POST)
    public String insert(@ModelAttribute(value = "user") Particulier user) {
        DaoGeneric dao = factoryDao.getDao(Particulier.class);
        dao.insert(user);
        return "index1";

    }
    
    @RequestMapping(value = "/modification", method = RequestMethod.GET)
    public String update(Model model, HttpServletRequest request) {
        
        String ids = request.getParameter("id");
        int id = 0;
        try {
            id = Integer.parseInt(ids);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        DaoGeneric dao = factoryDao.getDao(Particulier.class);
        Client client = (Client) dao.SelectById(Particulier.class.toString(),id);
        model.addAttribute("user", client);
        return "inscription";
    }

    @RequestMapping(value = "/modification", method = RequestMethod.POST)
    public String update(@ModelAttribute(value = "user") Client user) {
        DaoGeneric dao = factoryDao.getDao(Client.class);
        dao.update(user);
        return "index";
    }
    
     @RequestMapping(value = "/suppression", method = RequestMethod.POST)
    public String delete(@ModelAttribute(value = "user") Client user) {
        DaoGeneric dao = factoryDao.getDao(Particulier.class);
        dao.delete(user);
        return "index";
    }
    
      
}
