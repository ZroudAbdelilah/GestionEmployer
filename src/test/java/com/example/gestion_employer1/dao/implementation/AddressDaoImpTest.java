package com.example.gestion_employer1.dao.implementation;

import com.example.gestion_employer1.models.Address;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AddressDaoImpTest {

    @Test
    void add() {
        AddressDaoImp addressDaoImp = new AddressDaoImp();
        Address address = new Address("morocco","marrakech-asfi","youssoufia test",46300);
        assertInstanceOf(Address.class,addressDaoImp.add(address));
    }

    @Test
    void find() {
        AddressDaoImp addressDaoImp = new AddressDaoImp();
        assertInstanceOf(Address.class,addressDaoImp.find(new Long (1) ));
    }

    @Test
    void getAll() {
        AddressDaoImp addressDaoImp = new AddressDaoImp();
        ArrayList<Address> addresses = new ArrayList<Address>();
        assertInstanceOf(addresses.getClass(),addressDaoImp.getAll());
    }

    @Test
    void update() {
        AddressDaoImp addressDaoImp = new AddressDaoImp();
        Address address = new Address(new Long (1),"morocco","marrakech-asfi","youssoufia test update",46300);
        assertInstanceOf(Address.class,addressDaoImp.update(address));
    }

    @Test
    void delete() {
        AddressDaoImp addressDaoImp = new AddressDaoImp();
        assertTrue(addressDaoImp.delete(new Long(3)));
    }
}