/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.metier;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Guillaume
 */
@Entity
@Table(name="particulier"
    ,catalog="Stock"
)
public class Particulier extends Client {
    
  
    private String nom;
    private String prenom;
    
    
    public Particulier() {
        super();
    }

    public Particulier(String nom, String prenom, String telephone, String adresse, String ville, String email) {
        super(telephone, adresse, ville, email);
        this.nom = nom;
        this.prenom = prenom;
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
        return "Particulier{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
    
    

    
    
}
