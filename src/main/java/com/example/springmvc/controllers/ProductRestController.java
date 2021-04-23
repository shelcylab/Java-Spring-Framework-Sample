/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springmvc.controllers;

import com.example.springmvc.models.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author shelc
 */
@RestController
public class ProductRestController {
    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
        List<Product> products = new ArrayList<>();
        
        for(int i=1;i<10;i++)
        {
            Product p =new Product();
            
            p.setName("Product" + i);
            p.setQty(i * 100);
            p.setPrice(i * 1.5);
            
            products.add(p);
        }
        
        return products;
    }
    
}
