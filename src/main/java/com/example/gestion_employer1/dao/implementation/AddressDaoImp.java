package com.example.gestion_employer1.dao.implementation;

import com.example.gestion_employer1.dao.interfaces.AddressDao;
import com.example.gestion_employer1.entity.AddressEntity;
import com.example.gestion_employer1.hibernate.HSessionFactory;
import com.example.gestion_employer1.models.Address;
import org.hibernate.Session;

import java.util.ArrayList;

public class AddressDaoImp implements AddressDao {
    @Override
    public Address add(Address address) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();

        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setCountry(address.getCountry());
        addressEntity.setRegional(address.getRegional());
        addressEntity.setCity(address.getCity());
        addressEntity.setPostal_code(address.getPostal_code());

        session.save(addressEntity);
        session.getTransaction().commit();
        session.close();
        address.setId_address(address.getId_address());
        return address;
    }


    @Override
    public Address find(Long id) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        AddressEntity addressEntity = (AddressEntity) session.get(AddressEntity.class,id);
        session.close();
        Address address = new Address();
        address.setId_address(address.getId_address());
        address.setCountry(address.getCountry());
        address.setRegional(address.getRegional());
        address.setCity(address.getCity());
        address.setPostal_code(address.getPostal_code());

        return address;

    }
    @Override
    public ArrayList<Address> getAll() {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        ArrayList<AddressEntity> addressEntity = (ArrayList<AddressEntity>) session.createCriteria(AddressEntity.class).list();
        ArrayList<Address> addresss = new ArrayList<Address>();
        for (int i=0;i < addressEntity.size();i++){
            Address address = new Address();
            address.setId_address(addressEntity.get(i).getId_address());
            address.setCountry(addressEntity.get(i).getCountry());
            address.setRegional(addressEntity.get(i).getRegional());
            address.setCity(addressEntity.get(i).getCity());
            address.setPostal_code(addressEntity.get(i).getPostal_code());

            addresss.add(address);
        }
        session.close();
        return addresss;
    }


    @Override
    public Address update(Address address) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();

        session.find(AddressEntity.class,address.getId_address());
        AddressEntity addressEntity = new AddressEntity();

        addressEntity.setId_address(address.getId_address());
        addressEntity.setCountry(address.getCountry());
        addressEntity.setRegional(address.getRegional());
        addressEntity.setCity(address.getCity());
        addressEntity.setPostal_code(address.getPostal_code());

        session.merge(addressEntity);
        session.getTransaction().commit();
        session.close();
        return address;
    }
    @Override
    public boolean delete(Long id) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        AddressEntity addressEntity = session.load(AddressEntity.class,id);
        session.delete(addressEntity);
        session.getTransaction().commit();
        return true;
    }



}
