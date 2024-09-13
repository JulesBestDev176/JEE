package sn.isi.gestionstockv2.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sn.isi.gestionstockv2.entities.Produit;

import java.util.List;

public class ProduitImpl implements IProduit{

    private EntityManager em;

    public ProduitImpl() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("stockPU");
        em = emf.createEntityManager();
    }
    @Override
    public int add(Produit p) {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            return 1;
        }catch (Exception e) {
            e.printStackTrace();
            return  0;
        }
    }

    @Override
    public List<Produit> list() {
        return em.createQuery("SELECT p FROM Produit p").getResultList();
    }
}
