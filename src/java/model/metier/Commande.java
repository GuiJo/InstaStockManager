/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.metier;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author johancarriel
 */
@Entity
@Table(name="commande"
    ,catalog="Stock"
)
public class Commande extends Metier implements Serializable {
 
      private int id;
      //private Set<LigneCommande> ligneCmd  = new HashSet(0);
      private Employe employe;
      private Client client;
      

    public Commande() {
    }

    public Commande(int id, Employe employe, Client client) {
        this.id = id;
        this.employe = employe;
        this.client = client;
    }
  
    
    @Id
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_employe")
    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_Client")
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
   //    @OneToMany(mappedBy = "commande")
   // public Set<LigneCommande> getLigneCmd() {
    //    return ligneCmd;
   // }

    //public void setLigneCmd(Set<LigneCommande> ligneCmd) {
     //   this.ligneCmd = ligneCmd;
    //}

    @Override
    public String toString() {
        return "Commande{" + "id=" + id + ", ligneCmd=" + ", employe=" + employe + ", client=" + client + '}';
    }

   
   
      
     
      
      
}
