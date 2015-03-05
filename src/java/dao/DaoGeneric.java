/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.util.List;
import model.metier.Metier;
import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 *
 * @author userinsta
 */

public abstract class DaoGeneric<T extends Metier>  extends HibernateDaoSupport{

   
    
    public DaoGeneric() {
       
    }
    
    

    public void insert(T objet) {
        System.out.println(objet);
        Session session = getHibernateTemplate().getSessionFactory().openSession();
        session.setFlushMode(FlushMode.AUTO);
        session.save(objet);
        session.flush();
       
    }

    public void update(T objet) {
        
       Session session = getHibernateTemplate().getSessionFactory().openSession();
        session.setFlushMode(FlushMode.AUTO);
        session.update(objet);
        session.flush();
    }

    public void delete(T objet) {
        
       getHibernateTemplate().delete(objet);
    }

    public List<T> selectAll(Class metier) {
       
        List<T> l = getHibernateTemplate().loadAll(metier);
        return l;
        
    }

    public T SelectById(String metier,int id){
      T objet = (T) getHibernateTemplate().get(metier, id);
                
                 return objet;
    }
    
  
   
    
    
}
