/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoGeneric;
import factory.FactoryDao;
import java.util.List;
import model.metier.Auteurs;
import model.metier.Editeurs;
import model.metier.Livres;
import model.metier.Villes;
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
@RequestMapping("/livre")
public class LibrairieController {
    
    @RequestMapping("/livres")
    public String listLivres(){
        return "livres";
    }
    @RequestMapping(value="/ajout", method = RequestMethod.GET)
    public String ajoutLivre(Livres livre){
        DaoGeneric dao = FactoryDao.getDao(Livres.class);
        dao.insert(livre);
        return "ajoutLivre";
    }
    
    @ModelAttribute(value = "lAuteurs")
    public List<Auteurs> listeAuteurs() {
        DaoGeneric dao = FactoryDao.getDao(Auteurs.class);
        return dao.selectAll(Auteurs.class);
       
    }
    
    @ModelAttribute(value = "lEditeurs")
    public List<Editeurs> listeEditeurs() {
        DaoGeneric dao = FactoryDao.getDao(Editeurs.class);
        return dao.selectAll(Editeurs.class);
        
    }
    
}
