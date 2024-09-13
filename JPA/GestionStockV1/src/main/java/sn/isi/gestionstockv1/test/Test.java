package sn.isi.gestionstockv1.test;
import sn.isi.gestionstockv1.dao.ProduitImpl;
import sn.isi.gestionstockv1.entities.Produit;

public class Test {
    public static void main(String[] args) {
        ProduitImpl produitdao = new ProduitImpl();
        Produit produit = new Produit();
        produit.setNom("Ordinateur");
        produit.setQteStock(125);

        int ok = produitdao.add(produit);
        System.out.println(ok);
    }
}
