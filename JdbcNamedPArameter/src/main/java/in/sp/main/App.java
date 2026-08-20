package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.sp.resources.SpringConfig;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
       NamedParameterJdbcTemplate npJdbcTemplate=context.getBean(NamedParameterJdbcTemplate.class);
       Map<String,Object> mp=new HashMap<>();
       mp.put("key_roll", 634);
       mp.put("key_NAme", "Shivanand");
       mp.put("key_Marks", 56.5f);
       
       String sqlQuery="insert into studentdb values(:key_roll,:key_NAme,:key_Marks)";
       int count=npJdbcTemplate.update(sqlQuery, mp);
       
       if(count>0)
    	   System.out.println("INsertion succes");
       else
    	   System.out.println("Insertion Failed");
       
    }
}
