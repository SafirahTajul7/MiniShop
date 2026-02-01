/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package session;

import entity.OrderItem;
import entity.OrderEntity;
import java.util.List;
import javax.ejb.Local;

@Local
public interface OrderItemSessionBeanLocal {
    void addOrderItem(OrderItem item);
    List<OrderItem> getItemsByOrder(OrderEntity order);
    void deleteOrderItem(int id);
}