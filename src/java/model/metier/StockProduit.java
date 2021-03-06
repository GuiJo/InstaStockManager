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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author johancarriel
 */
@Entity
@Table(name="stockProduit"
    ,catalog="Stock"
)
public class StockProduit extends Metier implements Serializable{
    
    
    private int id;
    private int quantite;
    private Produit produit;

    public StockProduit() {
    }

    public StockProduit(int id, int quantite, Produit produit) {
        this.id = id;
        this.quantite = quantite;
        this.produit = produit;
    }

    @Id
     @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id_stockProduit", unique=true, nullable=false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_Produit")
    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
    
    @Column(name="quantite", nullable=false, length=50)
    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "StockProduit{" + "quantite=" + quantite + ", produit=" + produit + '}';
    }
    
    
    
}
