package org.example;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
    private String brand;
    private String size;

    public Tyre(String brand) {
        this.brand = brand;
    }


    public String getSize() {
        return size;
    }

    public Tyre(){}

    public Tyre(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tyree";
    }
}
