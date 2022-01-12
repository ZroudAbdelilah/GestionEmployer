package com.example.gestion_employer1.models;

public class Role {
    private Long id_role;
    private String name;

    public Role() {
    }

    public Role(Long id_role, String name) {
        this.id_role = id_role;
        this.name = name;
    }

    public Long getId_role() {
        return id_role;
    }

    public void setId_role(Long id_role) {
        this.id_role = id_role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
