package com.hibernate.main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entities.User;

public class App 
{
    public static void main( String[] args )
    {
    	
    	User user=new User();
    	user.setId(1);
    	user.setName("Shiva");
    	user.setEmail("Shiva@gmail.com");
    	user.setPassword("aman@123");
    	user.setCity("Azamgarh");
    	user.setPhone("9846175212");
    	
    	
    	Configuration cfg=new Configuration();
    	cfg.configure("/com/hibernate/config/hibernate.cfg.xml");
    	
    	SessionFactory sessionFactory=cfg.buildSessionFactory();
    	Session session=sessionFactory.openSession();
    	Transaction transaction=session.beginTransaction();
    	
    	
//   	//inserntion
    	try {
    		session.persist(user);
        	transaction.commit();
    	}
    	catch(Exception e) {
    		
   		transaction.rollback();
    	e.printStackTrace();
 		}
    	
    	//Select operation
    	try {
    		User user2=session.get(User.class, 1);
    		System.out.println(user2.getName());
    		System.out.println(user2.getEmail());
    		System.out.println(user2.getPassword());
    		System.out.println(user2.getPhone());
    		System.out.println(user2.getCity());
    	}
    	catch(Exception e) {
    		e.printStackTrace();    
    		}

    	
    	
    	
    	
    	//update operation
    	try {
    		User user3 = session.get(User.class, 4);
    		if (user3 != null) {
        	    user3.setCity("Delhi");
        	}

        	transaction.commit();
        	System.out.println(user3.getCity());

    	}
    	catch(Exception e) {
    		
    		transaction.rollback();
    		e.printStackTrace();
    		}
    	
    	//Delete operation now we will remove id=1;
    	try { 
    		User user1=new User();
    		user1.setId(1);
    		session.remove(user1);
    		transaction.commit();
        	System.out.println("USer is deleted succesfully!!");

    	}
    	catch(Exception e) {
    		
    		transaction.rollback();
    		e.printStackTrace();
    		}
    	
    }
}
