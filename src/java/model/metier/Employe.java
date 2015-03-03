/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.metier;

/**
 *
 * @author Guillaume
 */
public class Employe extends Personne{
    
    private String password;

    public Employe(String password, String nom, String prenom, String telephone, Adresse adresse, String email) {
        super(nom, prenom, telephone, adresse, email);
        this.password = password;
    }

    public Employe() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
       
}
