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
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int pid;
        private String name;

        public int getPid() {
            return pid;
        }

        public void setPid(int pid) {
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