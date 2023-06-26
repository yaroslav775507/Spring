package com.example.demo;

public class Alcohols {
    private final int id;
    private String title;
    private String manufacturer;
    private String country;
    private int premium;
    private int excerpt;
    private int strength;
    private double cost;

    public Alcohols(int id, String title, String manufacturer, String country, int excerpt, double cost,int premium,int strength) {
        this.id = id;
        this.title = title;//
        this.manufacturer = manufacturer;
        this.country =country;
        this.excerpt = excerpt;
        this.premium = premium;
        this.strength = strength;
        this.cost = cost;//
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public int getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(int excerpt) {
        this.excerpt = excerpt;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
