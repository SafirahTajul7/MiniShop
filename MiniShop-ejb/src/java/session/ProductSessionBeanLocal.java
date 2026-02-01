/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package session;

import entity.Product;
import java.util.List;
import javax.ejb.Local;

@Local
public interface ProductSessionBeanLocal {
    void addProduct(Product product);
    List<Product> getAllProducts();
    Product findProductById(int id);
    void updateProduct(Product product);
    void deleteProduct(int id);
}