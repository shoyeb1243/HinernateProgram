package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Started Project");
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        Employee employee=new Employee();
        employee.setId(101);
        employee.setName("SilentBoy");
        employee.setSalary(10000);
        employee.setAddress("Mumbai");
        session.save(employee);
        transaction.commit();
        session.close();
    }
}
