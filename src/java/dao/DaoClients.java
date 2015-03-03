/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.util.List;
import model.metier.Clients;
import model.metier.Metier;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author userinsta
 */
public class DaoClients extends DaoGeneric<Clients>{

    public DaoClients() {
        super();
    }

    
    
 
    public Clients connection (Clients clients){
        

        String sql = "FROM Clients WHERE EMail = ? AND mdp = ?";
//        String sql = "FROM Clients WHERE EMail = :email AND mdp = :mdp";
        //Query query  = session.createQuery(sql);
        //query.setString(0, clients.getEmail());
//        query.setString(":email", email);
        //query.setString(1, clients.getMdp());
//        query.setString(":mdp", mdp);
        
         //Clients client = (Clients) query.uniqueResult();
        
         //return client;
        return null;
        
    }

   
    
}
