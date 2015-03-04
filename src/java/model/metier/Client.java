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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author johancarriel
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Client extends Metier implements Serializable {
    
    private int id;
    private String telephone;
    private String adresse;
    private String ville;
    private String email;
     private Set<Commande> commandes  = new HashSet(0);

    public Client() {
    }

    public Client(String telephone, String adresse, String ville, String email) {
      
        this.telephone = telephone;
        this.adresse = adresse;
        this.ville = ville;
        this.email = email;
    }


   
    @Id 
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
  

     @Column(name="telephone", length=50)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Column(name="email", length=50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name="adresse", length=50)
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Column(name="ville", length=50)
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
    
    @OneToMany(mappedBy = "client")
    public Set<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Set<Commande> commandes) {
        this.commandes = commandes;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", telephone=" + telephone + ", adresse=" + adresse + ", ville=" + ville + ", email=" + email + ", commandes=" + commandes + '}';
    }

 

    
}
