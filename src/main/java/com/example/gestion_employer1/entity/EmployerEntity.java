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

}
