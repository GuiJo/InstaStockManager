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
public class Adresse extends Metier implements Serializable{
    
    private String adresse;
    private Ville ville;

    public Adresse() {
    }

    public Adresse(String adresse, Ville ville) {
        this.adresse = adresse;
        this.ville = ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Adresse{" + "adresse=" + adresse + ", ville=" + ville + '}';
    }    
}
