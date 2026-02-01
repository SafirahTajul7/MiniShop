package entity;

import entity.Customer;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2025-06-13T19:26:13")
@StaticMetamodel(OrderEntity.class)
public class OrderEntity_ { 

    public static volatile SingularAttribute<OrderEntity, Double> totalAmount;
    public static volatile SingularAttribute<OrderEntity, Integer> orderID;
    public static volatile SingularAttribute<OrderEntity, Date> orderDate;
    public static volatile SingularAttribute<OrderEntity, Customer> customer;

}