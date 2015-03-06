/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.metier;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author johancarriel
 */
@Entity
@Table(name="categorie"
    ,catalog="Stock"
)
public class Categorie extends Metier implements Serializable{
    
    
 
    private int id;
    private String nom;
   

    public Categorie() {
    }
    
    @Id
     @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id_categorie", unique=true, nullable=false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="nom_categorie", nullable=false, length=50)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
  

    
     
    @Override
    public String toString() {
        return nom;
    }
    
    
    
}
