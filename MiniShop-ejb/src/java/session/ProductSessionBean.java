/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package session;

import entity.Product;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

@Stateless
public class ProductSessionBean implements ProductSessionBeanLocal {

    @PersistenceContext(unitName = "MiniShopPU")
    private EntityManager em;

    public void addProduct(Product product) {
        em.persist(product);
    }

    public List<Product> getAllProducts() {
        return em.createQuery("SELECT p FROM Product p", Product.class).getResultList();
    }

    public Product findProductById(int id) {
        return em.find(Product.class, id);
    }

    public void updateProduct(Product product) {
        em.merge(product);
    }

    public void deleteProduct(int id) {
        Product product = em.find(Product.class, id);
        if (product != null) {
            em.remove(product);
        }
    }
}