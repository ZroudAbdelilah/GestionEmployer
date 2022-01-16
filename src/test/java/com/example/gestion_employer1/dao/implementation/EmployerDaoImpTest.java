package com.example.gestion_employer1.dao.implementation;

import com.example.gestion_employer1.dao.interfaces.EmployerDao;
import com.example.gestion_employer1.entity.AddressEntity;
import com.example.gestion_employer1.entity.EmployerEntity;
import com.example.gestion_employer1.entity.RoleEntity;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployerDaoImpTest {

    @Test
    void add() {
        EmployerDao employerDao = new EmployerDaoImp();
        RoleEntity role = new RoleEntity(new Long(2),"employer");
        AddressEntity address = new AddressEntity(new Long(1),"morocco nv version","marrakech-asfi","youssoufia",46300);
        EmployerEntity employer = new EmployerEntity("abdelilah2","Zroud 2","abdelilahzroud@gmail.com","1234",role,address,new Date(1020,10,17),new Date(1020,12,17));

        assertInstanceOf(EmployerEntity.class,employerDao.add(employer));

    }

    @Test
    void find() {
        EmployerDao employerDao = new EmployerDaoImp();
        assertInstanceOf(EmployerEntity.class,employerDao.find(new Long(1)));
    }

    @Test
    void getAll() {
        EmployerDao employerDao = new EmployerDaoImp();
        ArrayList<EmployerEntity> employers = new ArrayList<EmployerEntity>();
        assertInstanceOf(employers.getClass(),employerDao.getAll());
    }

    @Test
    void update() {
        EmployerDao employerDao = new EmployerDaoImp();
        RoleEntity role = new RoleEntity(new Long(2),"employer");
        AddressEntity address = new AddressEntity(new Long(1),"morocco test","marrakech-asfi","youssoufia enleve models",46300);
        EmployerEntity employer = new EmployerEntity("abdelilah up","Zroud","abdelilahzroud@gmail.com","1234",role,address,new Long(1),new Date(2020,10,17),new Date(2020,12,17));
        assertInstanceOf(EmployerEntity.class,employerDao.update(employer));
    }

    @Test
    void delete() {
        EmployerDao employerDao = new EmployerDaoImp();
        assertTrue(employerDao.delete(new Long(2)));
    }
}