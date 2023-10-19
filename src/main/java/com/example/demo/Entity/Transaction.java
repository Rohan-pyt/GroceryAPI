package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;
    @Data
    @Entity
    @Table(name="transaction")
    public class Transaction {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long Tid;

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name="product_id", referencedColumnName = "id")
        private Product product;

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name="user_id", referencedColumnName = "id")
        private User user;

    }

