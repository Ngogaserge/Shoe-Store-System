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
public class Shoe implements Serializable {
   
    private static final long serialVersionUID = 5722910639456532911L;
   private int shoeId;
    private String shoeName;
    private String brand;
    private int shoeSize;
    private Double price;

    public Shoe() {
    }

    public Shoe(int shoeId, String shoeName, String brand, int shoeSize, Double price) {
        this.shoeId = shoeId;
        this.shoeName = shoeName;
        this.brand = brand;
        this.shoeSize = shoeSize;
        this.price = price;
    }

    public int getShoeId() {
        return shoeId;
    }

    public void setShoeId(int shoeId) {
        this.shoeId = shoeId;
    }

    public String getShoeName() {
        return shoeName;
    }

    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
}
