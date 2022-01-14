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
        RoleEntity role = new RoleEntity(new Long(3),"Employer");
        AddressEntity address = new AddressEntity(new Long(1),"morocco test","marrakech-asfi","youssoufia enleve models",46300);
        EmployerEntity employer = new EmployerEntity("abdelilah","Zroud add","abdelilahzroud@gmail.com","1234",role,address,new Date(2020,10,17),new Date(2020,12,17));
        //EmployerEntity employer1 =new EmployerEntity("test1","testttt","test@gmail.com","12344",role,address,new Date(1019,10,12),new Date(1019,10,12));
        assertInstanceOf(EmployerEntity.class,employerDao.add(employer));
        //assertInstanceOf(EmployerEntity.class,employerDao.add(employer1));
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
        RoleEntity role = new RoleEntity(new Long(3),"Employer");
        AddressEntity address = new AddressEntity(new Long(1),"morocco test","marrakech-asfi","youssoufia enleve models",46300);
        EmployerEntity employer = new EmployerEntity("abdelilah up","Zroud","abdelilahzroud@gmail.com","1234",role,address,new Long(43),new Date(2020,10,17),new Date(2020,12,17));
        assertInstanceOf(EmployerEntity.class,employerDao.update(employer));
    }

    @Test
    void delete() {
        EmployerDao employerDao = new EmployerDaoImp();
        assertTrue(employerDao.delete(new Long(40)));
    }
}