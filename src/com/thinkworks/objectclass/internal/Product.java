package com.thinkworks.objectclass.internal;

public class Product {
    private int productId;
    private String name;
    private double price;
    private String brand;
    private int quantity;

    public Product(int productId, String name, double price, String brand, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.quantity = quantity;

    }

    @Override
    public String toString() {
        return "Product : "+productId+", Name : "+name+", Price : "
                +price+", Brand : "+brand +", Quantity : "+quantity;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Product){
            com.thinkworks.objectclass.internal.Product product =(Product)obj;
            if(this.productId==product.getProductId()){
                if(this.name.equals(product.getName())){
                    if(this.price==product.getPrice()){
                        if(this.brand.equals(product.getBrand())){
                            if(this.quantity==product.getQuantity()){
                                return true;
                            }
                        } return false;
                    } return false;
                } return false;
            }return false;
        }
        else return false;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
