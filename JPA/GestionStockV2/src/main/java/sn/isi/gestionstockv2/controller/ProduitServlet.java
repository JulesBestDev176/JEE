package sn.isi.gestionstockv2.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sn.isi.gestionstockv2.dao.ProduitImpl;
import sn.isi.gestionstockv2.entities.Produit;

import java.io.IOException;

@WebServlet(urlPatterns="/produit", name="produit")
public class ProduitServlet extends HttpServlet {

    private ProduitImpl produitdao;

    @Override
    public void init(ServletConfig config) throws ServletException {
        produitdao = new ProduitImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //resp.getWriter().println("ok");

        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = req.getParameter("nom").toString();
        double qteStock = Double.parseDouble(req.getParameter("qte"));

        Produit produit = new Produit();
        produit.setNom(nom);
        produit.setQteStock(qteStock);

        int ok = produitdao.add(produit);
        resp.getWriter().println(ok);
    }
}
