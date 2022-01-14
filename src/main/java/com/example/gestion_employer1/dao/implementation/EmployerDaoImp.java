package com.example.gestion_employer1.dao.implementation;

import com.example.gestion_employer1.dao.interfaces.EmployerDao;
import com.example.gestion_employer1.entity.AddressEntity;
import com.example.gestion_employer1.entity.EmployerEntity;
import com.example.gestion_employer1.entity.RoleEntity;
import com.example.gestion_employer1.hibernate.HSessionFactory;
import org.hibernate.Session;

import java.util.ArrayList;

public class EmployerDaoImp implements EmployerDao {
    @Override
    public EmployerEntity add(EmployerEntity employer) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();

        EmployerEntity employerEntity= new EmployerEntity();
        employerEntity.setFirst_name(employer.getFirst_name());
        employerEntity.setLast_name(employer.getLast_name());
        employerEntity.setEmail(employer.getEmail());
        employerEntity.setPassword(employer.getPassword());
        employerEntity.setAddress(employer.getAddress());
        employerEntity.setRole(employer.getRole());
        employerEntity.setDate_in(employer.getDate_in());
        employerEntity.setDate_out(employer.getDate_out());

        session.save(employerEntity);
        session.getTransaction().commit();
        session.close();
        employer.setId_user(employer.getId_user());
        return employer;
    }
    @Override
    public EmployerEntity find(Long id) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        EmployerEntity employerEntity = (EmployerEntity) session.get(EmployerEntity.class,id);
        session.close();

        EmployerEntity employer = new EmployerEntity();
        employer.setId_user(employer.getId_user());
        employer.setEmail(employer.getEmail());
        employer.setFirst_name(employer.getFirst_name());
        employer.setLast_name(employer.getLast_name());
        employer.setPassword(employer.getPassword());
        employer.setAddress(employer.getAddress());
        employer.setRole(employer.getRole());
        employerEntity.setDate_in(employer.getDate_in());
        employerEntity.setDate_out(employer.getDate_out());

        return employer;

    }
    @Override
    public ArrayList<EmployerEntity> getAll() {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        ArrayList<EmployerEntity> employerEntity = (ArrayList<EmployerEntity>
                ) session.createCriteria(EmployerEntity.class).list();
        ArrayList<EmployerEntity> employers = new ArrayList<EmployerEntity>();
        for (int i=0;i < employerEntity.size();i++){
            EmployerEntity employer = new EmployerEntity();

            employer.setId_user(employerEntity.get(i).getId_user());
            employer.setEmail(employerEntity.get(i).getEmail());
            employer.setFirst_name(employerEntity.get(i).getFirst_name());
            employer.setLast_name(employerEntity.get(i).getLast_name());
            employer.setPassword(employerEntity.get(i).getPassword());
            employer.setAddress(employerEntity.get(i).getAddress());
            employer.setRole(employerEntity.get(i).getRole());
            employer.setDate_in(employerEntity.get(i).getDate_in());
            employer.setDate_out(employerEntity.get(i).getDate_out());

            employers.add(employer);
        }
        session.close();
        return employers;
    }
    @Override
    public EmployerEntity update(EmployerEntity employer) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();

        session.find(EmployerEntity.class,employer.getId_user());

        EmployerEntity employerEntity = new EmployerEntity();

        employerEntity.setId_user(employer.getId_user());
        employerEntity.setEmail(employer.getEmail());
        employerEntity.setFirst_name(employer.getFirst_name());
        employerEntity.setLast_name(employer.getLast_name());
        employerEntity.setPassword(employer.getPassword());
        employerEntity.setAddress(employer.getAddress());
        employerEntity.setRole(employer.getRole());
        employerEntity.setDate_in(employer.getDate_in());
        employerEntity.setDate_out(employer.getDate_out());

        session.merge(employerEntity);
        session.getTransaction().commit();
        session.close();
        return employer;
    }
    @Override
    public boolean delete(Long id) {
        Session session = HSessionFactory.getInstance().getSession().openSession();
        session.beginTransaction();
        EmployerEntity employerEntity = session.load(EmployerEntity.class,id);
        session.delete(employerEntity);
        session.getTransaction().commit();
        return true;
    }
}
