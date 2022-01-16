package com.example.gestion_employer1.services.implementations;

import com.example.gestion_employer1.dao.implementation.AddressDaoImp;
import com.example.gestion_employer1.dao.interfaces.AddressDao;
import com.example.gestion_employer1.entity.AddressEntity;
import com.example.gestion_employer1.services.interfaces.AddressService;

import java.util.ArrayList;

public class AddressServiceImp implements AddressService {
    private AddressDao addressDao = new AddressDaoImp();
    @Override
    public AddressEntity add(AddressEntity address){
        return addressDao.add(address);
    }
    @Override
    public AddressEntity find(Long id){
        return addressDao.find(id);
    }
    @Override
    public ArrayList<AddressEntity> getAll(){
        return addressDao.getAll();
    }
    @Override
    public AddressEntity update(AddressEntity address){
        return addressDao.update(address);
    }
    @Override
    public boolean delete(Long id){
        return addressDao.delete(id);
    }

}
