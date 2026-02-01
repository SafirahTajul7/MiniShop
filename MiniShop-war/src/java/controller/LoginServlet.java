/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import entity.Customer;
import session.CustomerSessionBeanLocal;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @EJB
    private CustomerSessionBeanLocal customerBean;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        List<Customer> customers = customerBean.getAllCustomers();

        boolean match = false;
        for (Customer c : customers) {
            if (c.getEmail().equalsIgnoreCase(email)) {
                match = true;
                request.getSession().setAttribute("user", c);
                break;
            }
        }

        if (match) {
            response.sendRedirect("index.jsp");
        } else {
            response.sendRedirect("login.jsp?error=true");
        }
    }
}