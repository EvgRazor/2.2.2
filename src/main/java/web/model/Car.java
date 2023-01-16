package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String brand;
    private double value;
    private String color;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Car () {

    }

    public Car(String brand, double value, String color, int id) {
        this.brand = brand;
        this.value = value;
        this.color = color;
        this.id =  id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", value=" + value +
                ", color='" + color + '\'' +
                '}';
    }
}
