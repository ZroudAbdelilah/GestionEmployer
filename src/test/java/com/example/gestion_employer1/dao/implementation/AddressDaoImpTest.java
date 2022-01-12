package com.example.gestion_employer1.dao.implementation;


import com.example.gestion_employer1.dao.interfaces.AddressDao;
import com.example.gestion_employer1.entity.AddressEntity;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AddressDaoImpTest {

    @Test
    void add() {
        AddressDao addressDao = new AddressDaoImp();
        AddressEntity address = new AddressEntity("morocco nv version ","marrakech-asfi","youssoufia",46300);
        assertInstanceOf(AddressEntity.class,addressDao.add(address));
    }

    @Test
    void find() {
        AddressDao addressDao = new AddressDaoImp();
        assertInstanceOf(AddressEntity.class,addressDao.find(new Long (1) ));
    }

    @Test
    void getAll() {
        AddressDao addressDao = new AddressDaoImp();
        ArrayList<AddressEntity> addresses = new ArrayList<AddressEntity>();
        assertInstanceOf(addresses.getClass(),addressDao.getAll());
    }

    @Test
    void update() {
        AddressDao addressDao = new AddressDaoImp();
        AddressEntity address = new AddressEntity(new Long (1),"morocco test","marrakech-asfi","youssoufia enleve models",46300);
        assertInstanceOf(AddressEntity.class,addressDao.update(address));
    }

    @Test
    void delete() {
        AddressDao addressDao = new AddressDaoImp();
        assertTrue(addressDao.delete(new Long(3)));
    }
}