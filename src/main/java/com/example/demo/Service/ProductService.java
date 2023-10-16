package com.example.demo.Service;

import com.example.demo.Entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {


     List<Product> saveProducts(List<Product> products);


    Product saveProduct(Product Product);

    // Read operation
    List<Product> fetchProductList();

    // Update operation
    Product updateProduct(Product Product);

    // Delete operation
    String deleteProductById(int pid);

    Product getProductByName(String name);
}


