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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author johancarriel
 */
@Entity
@Table(name="produit"
    ,catalog="Stock"
)
public class Produit extends Metier implements Serializable{
    
    
    private int id;
    private String nom;
    private int prix;
    private String description;
    private Categorie categorie;
    private Set<LigneCommande> ligneCmd = new HashSet(0);
    

    public Produit() {
    }

    public Produit(int id, String nom, int prix, String description) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.description = description;
    }
    
    
    @Id
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Column(name="nom", nullable=false, length=50)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

     @Column(name="prix", nullable=false, length=50)
    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
    
     @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_Categorie")
    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

   

     @Column(name="description", nullable=false, length=50)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(mappedBy = "produit")
    public Set<LigneCommande> getLigneCmd() {
        return ligneCmd;
    }

    public void setLigneCmd(Set<LigneCommande> ligneCmd) {
        this.ligneCmd = ligneCmd;
    }

    
    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", nom=" + nom + ", prix=" + prix + ", description=" + description  +"'}'";
    }

    
    
   
    
}
