/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.FactoryDao;
import javax.servlet.http.HttpServletRequest;
import model.metier.Categorie;
import model.metier.Client;
import model.metier.Commande;
import model.metier.Metier;
import model.metier.Produit;
import org.hibernate.FlushMode;
import org.hibernate.Session;
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

public class DaoCommande extends DaoGeneric<Commande>{
    
    @Override
    public void insert(Metier objet) {
        System.out.println(objet);
        Session session = getHibernateTemplate().getSessionFactory().openSession();
        session.setFlushMode(FlushMode.AUTO);
        session.save(objet);
        session.flush();
        
        
       
    }
    
  
    
    
    
}
