/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.metier;

import java.io.Serializable;

/**
 *
 * @author Guillaume
 */
public abstract class Societe extends Metier implements Serializable{
    
    private int id;
    private String nom;
    private String siret;
    private Adresse adresse;

    public Societe() {
    }

    public Societe(int id, String nom, String siret, Adresse adresse) {
        this.id = id;
        this.nom = nom;
        this.siret = siret;
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Societe{" + "id=" + id + ", nom=" + nom + ", siret=" + siret + ", adresse=" + adresse + '}';
    }
        
}
