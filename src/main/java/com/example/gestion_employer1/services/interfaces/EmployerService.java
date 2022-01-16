package com.example.gestion_employer1.services.interfaces;

import com.example.gestion_employer1.entity.EmployerEntity;

import java.util.ArrayList;

public interface EmployerService {

    EmployerEntity add(EmployerEntity role);
    EmployerEntity find (Long id);
    ArrayList<EmployerEntity> getAll();
    EmployerEntity update(EmployerEntity employer);
    boolean delete(Long id);
}
