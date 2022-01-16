package com.example.gestion_employer1.entity;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class AdminEntity extends UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id_user;

    public AdminEntity(String first_name, String last_name, String email, String password, RoleEntity role, AddressEntity address) {
        super(first_name, last_name, email, password, role, address);
    }

    public AdminEntity() {
    }

    public AdminEntity(String first_name, String last_name, String email, String password, RoleEntity role, AddressEntity address, Long id_user) {
        super(first_name, last_name, email, password, role, address);
        this.id_user = id_user;
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
