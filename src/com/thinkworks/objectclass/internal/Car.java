package com.thinkworks.objectclass.internal;

public class Car {
    private int carId;
    private String model;
    private String brand;
    private double price;
    private int year;

    public Car(int carId, String model, String brand, double price, int year) {
        this.carId = carId;
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "ID : "+carId+", Model : "+model+
                ", Brand : "+brand+", Price : "+price+", Year : "+year;
    }

    @Override
    public boolean equals(Object obj) {
         if(obj instanceof Car){
             Car car=(Car)obj;
             if(this.carId==car.getCarId()){
                 if(this.model.equals(car.getModel())){
                     if(this.brand.equals(car.getBrand())){
                         if(this.price==car.getPrice()){
                             if(this.year==car.getYear()){
                                 return true;
                             }
                         } return false;
                     } return false;
                 } return false;
             }return false;
         }
         else return false;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
