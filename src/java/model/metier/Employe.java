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
 * @author Guillaume
 */
@Entity
@Table(name="employe"
    ,catalog="Stock"
)
public class Employe extends Metier implements Serializable{
    
    private int id;
    private String nom;
    private String prenom;
    private String password;
    private Set<Commande> commandes  = new HashSet(0);

    
    public Employe() {
       
    }

    public Employe(int id, String nom, String prenom, String password) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
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

    
    @Column(name="password", nullable=false, length=50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
      @OneToMany(mappedBy = "employe")
    public Set<Commande> getCommandes() {
        return commandes;
    }
    
    public void setCommandes(Set<Commande> commandes) {
        this.commandes = commandes;
    }

     @Column(name="nom", nullable=false, length=50)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

     @Column(name="prenom", nullable=false, length=50)
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Employe{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", password=" + password + ", commandes=" + commandes + '}';
    }
    
    
    
    
       
}
