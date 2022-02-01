package com.example.gestion_employer1.dao.implementation;

import com.example.gestion_employer1.dao.interfaces.AdminDao;
import com.example.gestion_employer1.entity.AdminEntity;
import com.example.gestion_employer1.entity.RoleEntity;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AdminDaoImpTest {

    @Test
    @Order(1)
    void add() {

        AdminDao adminDao = new AdminDaoImp();
        RoleEntity role = new RoleEntity(new Long(2),"admin");

        AdminEntity admin = new AdminEntity("admin","lastadmin","admin@gmail.com","1234",role);
        assertInstanceOf(AdminEntity.class,adminDao.add(admin));

    }

    @Test
    @Order(2)
    void find() {

        AdminDao adminDao =new AdminDaoImp();
        assertInstanceOf(AdminEntity.class,adminDao.find(new Long(5)));
    }

    @Test
    @Order(3)
    void getAll() {

        AdminDao adminDao = new AdminDaoImp();
        ArrayList<AdminEntity> admins = new ArrayList<AdminEntity>();
        assertInstanceOf(admins.getClass(),adminDao.getAll());
    }

    @Test
    @Order(4)
    void update() {

        AdminDao adminDao = new AdminDaoImp();
        RoleEntity role = new RoleEntity(new Long(2),"admin");

        AdminEntity admin = new AdminEntity("admin","update admin","admin@gmail.com","1234",role,new Long(3));
        assertInstanceOf(AdminEntity.class,adminDao.update(admin));
    }

    @Test
    @Order(5)
    void delete() {

        AdminDao adminDao = new AdminDaoImp();
        assertTrue(adminDao.delete(new Long(2)));
    }

}