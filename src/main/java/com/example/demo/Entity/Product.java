package com.example.demo.Entity;
import jakarta.persistence.*;
import lombok.*;

    @Data
    @NoArgsConstructor
    @Getter
    @Setter
    @Entity
    @Table(name="product")
    public class Product {
        @Override
        public String toString() {
            return "Product{" +
                    "pid=" + pid +
                    ", name='" + name + '\'' +
                    ", quantity=" + quantity +
                    ", price=" + price +
                    '}';
        }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer pid;


        private User user;

        private String name;

        public Integer getPid() {
            return pid;
        }

        public void setPid(Integer pid) {
            this.pid = pid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        private int quantity;
        private double price;
    }