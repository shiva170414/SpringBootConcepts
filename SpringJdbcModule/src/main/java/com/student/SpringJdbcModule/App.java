package com.student.SpringJdbcModule;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import in.sp.mapper.*;
import in.sp.beans.*;
import java.util.*;

import in.sp.resources.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int rollno=34;
    	String name="kattapa";
    	float marks=73.3f;
    	int count;
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        //-----insertion--------
         JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
        String insert_SQL_Query="insert into studentDb values(?,?,?)";
         count=jdbcTemplate.update(insert_SQL_Query,rollno,name,marks);
        if(count>0)
        	System.out.println("Insertion succesful");
        else
        	System.out.println("Insertion Failed");
        
        //-----------Updation------------
        name="Aman";
        
        String update_SQL_Query="update studentDb set stdName=? where rollno=?";
        count=jdbcTemplate.update(update_SQL_Query,name,rollno);
        if(count>0)
        	System.out.println("Updated succesfully");
        else
        	System.out.println("Updation failed");
        
        //DEletion
        name="Aman";
        String delete_SQL_Query="delete from studentdb where stdName=?";
        count=jdbcTemplate.update(delete_SQL_Query,name);
        if(count>0)
        	System.out.println("deleted succesfully");
        else
        	System.out.println("deletion failed");
        
        String select_Query="select * from studentdb";
        List<Student> stdList=jdbcTemplate.query(select_Query,new StudentRowMApper());
        for(Student st:stdList) {
        	System.out.println("Name :"+st.getName());
        	System.out.println("Roll No :"+st.getRollno());
        	System.out.println("MArks :"+st.getMarks());
        	System.out.println("============================================");
        }
        
        
    }
}
