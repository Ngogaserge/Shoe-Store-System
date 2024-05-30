/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Serge
 */
@Entity
public class Shoe implements Serializable {
    private static final long serialVersionUID = 5722910639456532911L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Override
    public String toString() {
        return "Shoe{" + "shoeId=" + shoeId + ", shoeName=" + shoeName + ", brand=" + brand + ", shoeSize=" + shoeSize + ", price=" + price + '}';
    }
    

}