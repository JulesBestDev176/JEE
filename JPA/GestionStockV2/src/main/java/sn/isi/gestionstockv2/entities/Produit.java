package sn.isi.gestionstockv2.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nom;
    @Column
    private double qteStock;

    public Produit() {
    }

    public Produit(int id, String nom, double qteStock) {
        this.id = id;
        this.nom = nom;
        this.qteStock = qteStock;
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

    public double getQteStock() {
        return qteStock;
    }

    public void setQteStock(double qteStock) {
        this.qteStock = qteStock;
    }
}
