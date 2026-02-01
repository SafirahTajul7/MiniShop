/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package session;

import entity.OrderEntity;
import entity.Customer;
import java.util.List;
import javax.ejb.Local;

@Local
public interface OrderSessionBeanLocal {
    void createOrder(OrderEntity order);
    OrderEntity findOrderById(int id);
    List<OrderEntity> getAllOrders();
    List<OrderEntity> getOrdersByCustomer(Customer customer);
}