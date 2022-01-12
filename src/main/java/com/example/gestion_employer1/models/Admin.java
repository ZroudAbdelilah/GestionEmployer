package com.example.gestion_employer1.models;

public class Admin extends User{
    public Admin() {
    }

    public Admin(Long id_user, String first_name, String last_name, String email, String password, Role role, Address address) {
        super(id_user, first_name, last_name, email, password, role, address);
    }
}
