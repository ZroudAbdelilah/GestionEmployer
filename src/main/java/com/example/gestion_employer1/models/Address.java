package com.example.gestion_employer1.models;

public class Address {
    private Long id_address;
    private String country;
    private String regional;
    private String city;
    private int postal_code;

    public Address() {
    }

    public Address(String country, String regional, String city, int postal_code) {

        this.country = country;
        this.regional = regional;
        this.city = city;
        this.postal_code = postal_code;
    }

    public Long getId_address() {
        return id_address;
    }

    public void setId_address(Long id_address) {
        this.id_address = id_address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegional() {
        return regional;
    }

    public void setRegional(String regional) {
        this.regional = regional;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }
}
