/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoGeneric;
import factory.FactoryDao;
import java.util.List;
import model.metier.Clients;
import model.metier.Villes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author userinsta
 */
@Controller
@RequestMapping(value = {"/user", "/admin"})
public class UserController {
    
    private FactoryDao factoryDao;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/inscription", method = RequestMethod.GET)
    public String inscription(Model model) {

        model.addAttribute("user", new Clients());
        return "inscription";
    }

    @RequestMapping(value = "/inscription", method = RequestMethod.POST)
    public String inscription(@ModelAttribute(value = "user") Clients user) {
        DaoGeneric dao = FactoryDao.getDao(Clients.class);
        dao.insert(user);
        return "index";

    }
//    @RequestMapping("/inscription")
//    public ModelAndView inscription(){
//        
//        ModelAndView model = new ModelAndView("inscription");
//        model.addObject("user", new User());
//        return model;
//    }

    @ModelAttribute(value = "lVilles")
    public List<Villes> listeVilles() {
        DaoGeneric dao = FactoryDao.getDao(Villes.class);
        List<Villes> l = dao.selectAll(Villes.class);
        return l;
    }

    public FactoryDao getFactoryDao() {
        return factoryDao;
    }
    
    @Autowired
    public void setFactoryDao(FactoryDao factoryDao) {
        this.factoryDao = factoryDao;
    }
    
    
}
