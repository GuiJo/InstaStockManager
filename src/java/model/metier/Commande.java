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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
      private String date;
      private Produit produit;
      private int quantite;
      

    public Commande() {
    }

    public Commande(Employe employe, Client client, String date, Produit produit, int quantite) {
        this.employe = employe;
        this.client = client;
        this.date = date;
        this.produit = produit;
        this.quantite = quantite;
    }

    
    @Id
     @GeneratedValue(strategy= GenerationType.AUTO)
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
    
    

     @Column(name="date", length=50)
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_produit")
    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Column(name="quantite")
    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
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
        return "Commande{" + "id=" + id + ", employe=" + employe + ", client=" + client + ", date=" + date + '}';
    }

     
      
      
}
