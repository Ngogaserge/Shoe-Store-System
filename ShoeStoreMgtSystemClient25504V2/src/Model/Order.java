/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Serge
 */
public class Order implements Serializable {

    private Integer orderId;
    private Shoe theShoe;
    private Customer customer;

    private Integer quantity;// Many-to-One relationship with Customer

    public Order() {
    }

    public Order(Integer orderId, Shoe theShoe, Customer customer, Integer quantity) {
        this.orderId = orderId;
        this.theShoe = theShoe;
        this.customer = customer;
        this.quantity = quantity;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Shoe getTheShoe() {
        return theShoe;
    }

    public void setTheShoe(Shoe theShoe) {
        this.theShoe = theShoe;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
