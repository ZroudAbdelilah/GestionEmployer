package com.example.gestion_employer1.services.interfaces;

import com.example.gestion_employer1.entity.AddressEntity;

import java.util.ArrayList;

public interface AddressService {

    AddressEntity add(AddressEntity address);
    AddressEntity find(Long id);
    ArrayList<AddressEntity> getAll();
    AddressEntity update(AddressEntity address);
    boolean delete(Long id);
}
