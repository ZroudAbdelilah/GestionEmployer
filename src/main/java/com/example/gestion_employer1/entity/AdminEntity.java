package com.example.gestion_employer1.entity;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class AdminEntity extends UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id_user;
}
