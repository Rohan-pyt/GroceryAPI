package com.example.demo.ServiceImp;

import com.example.demo.Entity.Product;
import com.example.demo.Repository.ProductRepo;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Product> fetchProductList(){
        return productRepo.findAll();
    }


    @Override
    public Product updateProduct(Product Product) {
        Product existingProduct = productRepo.findById(Product.getPid()).orElse(null);
        existingProduct.setName(Product.getName());
        existingProduct.setQuantity(Product.getQuantity());
        existingProduct.setPrice(Product.getPrice());
        return productRepo.save(existingProduct);
    }

    @Override
    public String deleteProductById(int pid) {
         productRepo.deleteById(pid);
        return "product removed !! " + pid;

    }

    @Override
    public Product getProductByName(String name) {
        return productRepo.getProductByName(name);
    }


}






