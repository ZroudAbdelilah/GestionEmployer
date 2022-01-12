package com.example.gestion_employer1.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="role")
public class RoleEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_role")
    private Long id_role;

    @Column(name="name")
    private String name;



    public Long getId_role() {
        return id_role;
    }

    public void setId_role(Long id_role) {
        this.id_role = id_role;
    }

    public String getRole() {
        return name;
    }

    public void setRole(String role) {
        this.name = name;
    }
}
