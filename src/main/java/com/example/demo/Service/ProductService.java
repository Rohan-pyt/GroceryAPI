package com.example.demo.Service;

import com.example.demo.Entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {


     List<Product> saveProducts(List<Product> products);


    Product saveProduct(Product Product);

    // Read operation
    List<Product> fetchProductList();


    // Delete operation
    String deleteProductById(Integer pid);

    Product getProductByName(String name);

   public Product getProductById(Integer pid);
}


