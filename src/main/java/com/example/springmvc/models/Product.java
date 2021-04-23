/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springmvc.models;

/**
 *
 * @author shelc
 */
public class Product {
    
    public String Name;
    public int Qty;
    public double Price;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    
    
    
}
