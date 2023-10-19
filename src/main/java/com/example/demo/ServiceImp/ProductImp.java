package com.example.demo.ServiceImp;

import com.example.demo.Entity.Product;
import com.example.demo.Repository.ProductRepo;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductImp implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> saveProducts(List<Product> products) {
        return productRepo.saveAll(products);
    }

    @Override
    public Product saveProduct(Product Product) {
        return productRepo.save(Product);
    }

    @Override
    public List<Product> fetchProductList() {
        return productRepo.findAll();
    }


    @Override
    public String deleteProductById(Integer pid) {
        if(productRepo.existsById(pid)){
            productRepo.deleteById(pid);
            return "product removed with ID no. !! " + pid;


        }
        return  ("No Product Found");

    }

    @Override
    public Product getProductByName(String name) {

        return productRepo.getProductByName(name);
    }

    @Override
    public Product getProductById(Integer pid) {
      return productRepo.findById(pid).get();


    }
}





