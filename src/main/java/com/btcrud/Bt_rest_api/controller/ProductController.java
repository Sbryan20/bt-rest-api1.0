/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btcrud.Bt_rest_api.controller;


import com.btcrud.Bt_rest_api.models.Product;
import com.btcrud.Bt_rest_api.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bryte
 */
@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api/products")
public class ProductController {
    
    @Autowired
    private ProductRepository Repository;
    
      
     //crear
    @PostMapping("/product")
    public Product create(@Validated @RequestBody Product p){
        return Repository.insert(p);
    }
    //lista
    @GetMapping("/")
    public List<Product>list(){
        return Repository.findAll();
    }
   //editar
    @PutMapping("/product/{id}")
    public Product update(@PathVariable String id, @Validated @RequestBody Product p){
        return Repository.save(p);
    }

    //eliminar
    @DeleteMapping("/product/{id}")
    public void delete(@PathVariable String id){
        Repository.deleteById(id);
    }
    
    
    
}
