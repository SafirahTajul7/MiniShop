/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package session;

import entity.OrderEntity;
import entity.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

@Stateless
public class OrderSessionBean implements OrderSessionBeanLocal {

    @PersistenceContext(unitName = "MiniShopPU")
    private EntityManager em;

    @Override
    public void createOrder(OrderEntity order) {
        em.persist(order);
    }

    @Override
    public OrderEntity findOrderById(int id) {
        return em.find(OrderEntity.class, id);
    }

    @Override
    public List<OrderEntity> getAllOrders() {
        return em.createQuery("SELECT o FROM OrderEntity o", OrderEntity.class).getResultList();
    }

    @Override
    public List<OrderEntity> getOrdersByCustomer(Customer customer) {
        return em.createQuery("SELECT o FROM OrderEntity o WHERE o.customer = :customer", OrderEntity.class)
                 .setParameter("customer", customer)
                 .getResultList();
    }
}