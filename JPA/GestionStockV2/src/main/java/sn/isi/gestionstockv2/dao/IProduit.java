package sn.isi.gestionstockv2.dao;

import sn.isi.gestionstockv2.entities.Produit;

import java.util.List;

public interface IProduit {
    public int add(Produit p);
    public List<Produit> list();
}
