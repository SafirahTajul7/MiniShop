/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package session;

import entity.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

@Stateless
public class CustomerSessionBean implements CustomerSessionBeanLocal {

    @PersistenceContext(unitName = "MiniShopPU")
    private EntityManager em;

    @Override
    public void addCustomer(Customer customer) {
        em.persist(customer);
    }

    @Override
    public Customer findCustomerById(int id) {
        return em.find(Customer.class, id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return em.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
    }

    @Override
    public void updateCustomer(Customer customer) {
        em.merge(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        Customer customer = em.find(Customer.class, id);
        if (customer != null) {
            em.remove(customer);
        }
    }
}