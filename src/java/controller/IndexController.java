/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import factory.FactoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author userinsta
 */
@Controller
public class IndexController {
    
    private FactoryDao factoryDao;

    public FactoryDao getFactoryDao() {
        return factoryDao;
    }

    @Autowired
    public void setFactoryDao(FactoryDao factoryDao) {
        this.factoryDao = factoryDao;
    }
    
    @RequestMapping(value = "/index")
    public String home()
    {
        
        return "login";
        
    }
 
    
}
