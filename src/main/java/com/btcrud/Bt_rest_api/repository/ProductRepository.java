/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.btcrud.Bt_rest_api.repository;

import com.btcrud.Bt_rest_api.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bryte
 */
@Repository
public interface ProductRepository extends MongoRepository<Product, String>{
    
}
