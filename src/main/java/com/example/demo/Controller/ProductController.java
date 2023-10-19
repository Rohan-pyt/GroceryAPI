package com.example.demo.Controller;


import com.example.demo.Entity.Product;
import com.example.demo.Repository.ProductRepo;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    //ADD Product
    @PostMapping("/addProduct")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product status= productService.saveProduct(product);
         return new ResponseEntity<Product>(status,HttpStatus.CREATED);
    }
  //List all products available
    @GetMapping("/showProducts")
    public List<Product> listallproduct() {
        return productService.fetchProductList();
    }
    @PostMapping("/addMultipleProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return productService.saveProducts(products);
    }
//get product by name
    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name) {

        return productService.getProductByName(name);
    }

    @PutMapping("/updateproduct/{pid}")
    public ResponseEntity<Product> updateProduct(@PathVariable("pid") Integer pid, @RequestBody Product product) {
        Product prod=productService.getProductById(pid);
        prod.setName(product.getName());
        prod.setPrice(product.getPrice());
        prod.setQuantity(product.getQuantity());
        Product p= productService.saveProduct(prod);
        return new ResponseEntity<Product>(p,HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteProduct/{pid}")
    public String deleteProduct(@PathVariable Integer pid) {
       return  productService.deleteProductById(pid);
    }

}

