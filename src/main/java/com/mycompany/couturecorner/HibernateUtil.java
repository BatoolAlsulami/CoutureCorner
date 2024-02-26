package com.mycompany.couturecorner;

import org.hibernate.SessionFactory; 
import org.hibernate.boot.MetadataSources; 
import org.hibernate.boot.registry.StandardServiceRegistryBuilder; 
import org.hibernate.cfg.Configuration; 
import org.hibernate.service.ServiceRegistry; 
public class HibernateUtil { 
    private static final SessionFactory sessionFactory; 
     
    static { 
        try { 
            Configuration config = new Configuration().configure(); 
            ServiceRegistry servReg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build(); 
 
            MetadataSources s = new MetadataSources( servReg ); 
            s.addAnnotatedClass(Rating.class);
            s.addAnnotatedClass(customer.class); 
            s.addAnnotatedClass(Accessories.class); 
            s.addAnnotatedClass(OutFit.class); 
            s.addAnnotatedClass(Bill.class); 
            // Add as much as the number of tables you have in your database ( we only have Student class in this tutorial) 
             
             
              sessionFactory = s.buildMetadata().buildSessionFactory(); 
     
        } catch (Throwable ex) { 
            // Log the exception.  
            System.err.println("Initial SessionFactory creation failed." + ex); 
            throw new ExceptionInInitializerError(ex); 
        } 
    } 
     
    public static SessionFactory getSessionFactory() { 
        return sessionFactory; 
    } 
} 
