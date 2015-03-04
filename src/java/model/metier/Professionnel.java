/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author Guillaume
 */
@Entity
@Table(name="pro"
    ,catalog="Stock"
)
public class Professionnel extends Client {
    
    
    private String siret;
  
    public Professionnel() {
     super();  
    }

    public Professionnel(String siret, String telephone, String adresse, String ville, String email) {
        super(telephone, adresse, ville, email);
        this.siret = siret;
    }

    @Column(name="siret", nullable=false, length=50)
    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    @Override
    public String toString() {
        return "Professionnel{" + "siret=" + siret + '}';
    }

    
   
    
}
