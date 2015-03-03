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

    protected HibernateTemplate hibernateTemp;
    
    public DaoGeneric() {
       
    }
    
    

    public void insert(Metier objet) {
       
        getHibernateTemplate().getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
       getHibernateTemplate().save(objet);
       
    }

    public void update(Metier objet) {
        
      getHibernateTemplate().update(objet);
    }

    public void delete(Metier objet) {
        
       getHibernateTemplate().delete(objet);
    }

    public List<Metier> selectAll(Class metier) {
       
        List<Metier> l = getHibernateTemplate().loadAll(metier);
        return l;
        
    }

    public HibernateTemplate getHibernateTemp() {
        return hibernateTemp;
    }


    public void setHibernateTemp(HibernateTemplate hibernateTemp) {
        this.hibernateTemp = hibernateTemp;
    }

   
    
    
}
