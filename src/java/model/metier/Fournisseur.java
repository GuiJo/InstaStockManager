/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.metier;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author johancarriel
 */
@Entity
@Table(name="fournisseur"
    ,catalog="Stock"
)
public class Fournisseur extends Metier implements Serializable{
    
    private int id;
    private String nom;
    private String siret;
    private String adresse;
    private String telephone;
    private String ville;
    
    public Fournisseur() {
    }

    public Fournisseur(int id, String nom, String siret, String adresse, String telephone, String ville) {
        this.id = id;
        this.nom = nom;
        this.siret = siret;
        this.adresse = adresse;
        this.telephone = telephone;
        this.ville = ville;
    }

    @Id 
     @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id_fournisseur", unique=true, nullable=false)
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

    @Column(name="siret", nullable=false, length=50)
    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    @Column(name="adresse", nullable=false, length=50)
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Column(name="telephone", nullable=false, length=50)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Column(name="ville", nullable=false, length=50)
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Fournisseur{" + "id=" + id + ", nom=" + nom + ", siret=" + siret + ", adresse=" + adresse + ", telephone=" + telephone + ", ville=" + ville + '}';
    }
 
    
    
    
    
}
