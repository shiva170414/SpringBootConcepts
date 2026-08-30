package com.example.main.repository;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.example.main.config.HibernateConfig;
import com.example.main.entities.User;

@Repository
public class DBOperationImpl implements DBOperation {

	@Override
	public User getUserDetails(int id) {
		
		User user=null;
		try(Session session=HibernateConfig.getSessionFactory().openSession();) {
			user=session.get(User.class, id);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		
	}
		return user;
	
	}
}
