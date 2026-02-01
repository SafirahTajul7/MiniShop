/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package session;

import entity.OrderItem;
import entity.OrderEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

@Stateless
public class OrderItemSessionBean implements OrderItemSessionBeanLocal {

    @PersistenceContext(unitName = "MiniShopPU")
    private EntityManager em;

    @Override
    public void addOrderItem(OrderItem item) {
        em.persist(item);
    }

    @Override
    public List<OrderItem> getItemsByOrder(OrderEntity order) {
        return em.createQuery("SELECT i FROM OrderItem i WHERE i.order = :order", OrderItem.class)
                 .setParameter("order", order)
                 .getResultList();
    }

    @Override
    public void deleteOrderItem(int id) {
        OrderItem item = em.find(OrderItem.class, id);
        if (item != null) {
            em.remove(item);
        }
    }
}