package com.example.gestion_employer1.models;

import java.sql.Date;

public class Employer extends User{
    private Date date_in;
    private Date date_out;

    public Employer() {
    }

    public Employer(Long id_user, String first_name, String last_name, String email, String password, Role role, Address address, Date date_in, Date date_out) {
        super(id_user, first_name, last_name, email, password, role, address);
        this.date_in = date_in;
        this.date_out = date_out;
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
}
