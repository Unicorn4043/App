package com.example.myapp03.model;

public class Car {
    private int Car_id;
    private String Car_image;
    private String Car_name;
    private String Car_type;
    private int Car_price;
    private  String  Car_Website_url;

    public int getCar_id() {
        return Car_id;
    }

    public void setCar_id(int Car_id) {
        this.Car_id = Car_id;
    }

    public String getCar_image() {
        return Car_image;
    }

    public void setCar_image(String Car_image) {
        this.Car_image = Car_image;
    }

    public String getCar_name() {
        return Car_name;
    }

    public void setCar_name(String Car_name) {
        this.Car_name = Car_name;
    }

    public String getCar_Website_url() {
        return Car_Website_url;
    }

    public void setCar_Website_url(String Car_Website_url) {
        this.Car_Website_url = Car_Website_url;
    }


    public String getCar_type() {
        return Car_type;
    }

    public void setCar_type(String Car_type) {
        this.Car_type = Car_type;
    }

    public int getCar_price() {
        return Car_price;
    }

    public void setCar_price(int Car_price) {
        this.Car_price = Car_price;
    }
}
