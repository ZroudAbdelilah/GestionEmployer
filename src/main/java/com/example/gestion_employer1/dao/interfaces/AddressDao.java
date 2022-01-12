package com.example.gestion_employer1.dao.interfaces;

import com.example.gestion_employer1.models.Address;

import java.util.ArrayList;

public interface AddressDao {
    Address add(Address address);
    Address find(Long id);
    ArrayList<Address> getAll();
    Address update(Address address);
    boolean delete(Long id);
}
