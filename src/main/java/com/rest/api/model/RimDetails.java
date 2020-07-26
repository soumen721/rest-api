package com.rest.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RimDetails {

    @Id
    @GeneratedValue
    private Long rimId;
    private String manufacturer;
    private Long price;

    // avoid this "No default constructor for entity"
    public RimDetails() {
    }

    public RimDetails(Long rimId, String name, Long price) {
        this.rimId = rimId;
        this.manufacturer = name;
        this.price = price;
    }

    public RimDetails(String name, Long price) {
        this.manufacturer = name;
        this.price = price;
    }

    public Long getRimId() {
        return rimId;
    }

    public void setRimId(Long rimId) {
        this.rimId = rimId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + rimId +
                ", name='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }

}
