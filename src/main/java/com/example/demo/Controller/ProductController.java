package com.example.demo.Controller;


import com.example.demo.Entity.Product;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController


public class ProductController {

    @Autowired
    private ProductService productService;


    //ADD Product
    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product) {
         productService.saveProduct(product);
         return ("Saved Successfully");
    }
  //List all products available
    @GetMapping("/showProducts")
    public List<Product> listallproduct() {
        return productService.fetchProductList();
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return productService.saveProducts(products);
    }
//get product by name
    @GetMapping("/product/{pname}")
    public Product findProductByName(@PathVariable String name) {

        return productService.getProductByName(name);
    }

    @PutMapping("/updateproduct")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("/deleteProduct/{pid}")
    public String deleteProduct(@PathVariable int pid) {
       return  productService.deleteProductById(pid);
    }

}

