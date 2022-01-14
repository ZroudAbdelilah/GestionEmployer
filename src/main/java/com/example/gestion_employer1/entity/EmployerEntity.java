package com.example.gestion_employer1.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "employer")
public class EmployerEntity extends UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id_user;

    @Column(name = "date_in")
    private Date date_in;

    @Column(name = "date_out")
    private Date date_out;

    public EmployerEntity(String first_name, String last_name, String email, String password, RoleEntity role, AddressEntity address, Date date_in, Date date_out) {
        super(first_name, last_name, email, password, role, address);
        this.date_in = date_in;
        this.date_out = date_out;
    }
    public EmployerEntity(String first_name, String last_name, String email, String password, RoleEntity role, AddressEntity address, Long id_user, Date date_in, Date date_out) {
        super(first_name, last_name, email, password, role, address);
        this.id_user = id_user;
        this.date_in = date_in;
        this.date_out = date_out;
    }


    public EmployerEntity() {
    }



    public Date getDate_in() {
        return date_in;
    }

    public void setDate_in(Date date_in) {
        this.date_in = date_in;
    }

    public Date getDate_out() {
        return date_out;
    }

    public void setDate_out(Date date_out) {
        this.date_out = date_out;
    }



   @Override
    public Long getId_user() {
        return id_user;
    }

    @Override
    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }



}
