package com.blacknwhite.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDRESS_ID")
    private int addressId;
    @Column(name = "CONTENT")
    private String content;
    @Column(name = "STATE")
    private String state;
    @Column(name = "CITY")
    private String city;
    @Column(name = "ZIPCODE")
    private String zipCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="CUSTOMER_ID",nullable = false)
    private Customer customer;
}
