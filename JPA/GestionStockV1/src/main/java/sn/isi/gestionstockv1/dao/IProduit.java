package sn.isi.gestionstockv1.dao;

import sn.isi.gestionstockv1.entities.Produit;

import java.util.List;

public interface IProduit {
    public int add(Produit p);
    public List<Produit> list();
}
