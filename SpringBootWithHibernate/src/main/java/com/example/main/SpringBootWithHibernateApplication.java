package com.example.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.main.entities.User;
import com.example.main.repository.DBOperation;

@SpringBootApplication
public class SpringBootWithHibernateApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootWithHibernateApplication.class, args);
       DBOperation dbop= context.getBean(DBOperation.class);
      User user= dbop.getUserDetails(4);
      
      if(user!=null) {
    	  System.out.println(user.getEmail());
    	  System.out.println(user.getCity());
      }
      else
    	  System.out.println("USER NOT FOUND!!");
	}

}
