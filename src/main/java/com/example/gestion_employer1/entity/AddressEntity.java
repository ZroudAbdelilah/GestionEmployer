package com.example.gestion_employer1.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "address")
public class AddressEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_address")
    private Long id_address;

    @Column(name = "country")
    private String country;

    @Column(name ="regional")
    private String regional;

    @Column(name = "city")
    private String city;

    @Column(name = "postal_code")
    private int postal_code;

    public AddressEntity(String country, String regional, String city, int postal_code) {
        this.country = country;
        this.regional = regional;
        this.city = city;
        this.postal_code = postal_code;
    }

    public AddressEntity(Long id_address, String country, String regional, String city, int postal_code) {
        this.id_address = id_address;
        this.country = country;
        this.regional = regional;
        this.city = city;
        this.postal_code = postal_code;
    }

    public AddressEntity(String country, String regional, String city, int postal_code, Set<UserEntity> users) {
        this.country = country;
        this.regional = regional;
        this.city = city;
        this.postal_code = postal_code;
        this.users = users;
    }

    public AddressEntity() {
    }

    @OneToMany(mappedBy = "address",cascade = CascadeType.ALL)
    private Set<UserEntity> users;

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

    @Override
    public String toString() {
        return "AddressEntity{" +
                "id_address=" + id_address +
                ", country='" + country + '\'' +
                ", regional='" + regional + '\'' +
                ", city='" + city + '\'' +
                ", postal_code=" + postal_code +
                ", users=" + users +
                '}';
    }
}
