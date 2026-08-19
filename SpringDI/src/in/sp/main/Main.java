package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	
	public static void main(String args[]) {
		String configLoc="/in/sp/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(configLoc);
		
		Student st=(Student)context.getBean("stdID");
		st.display();
	}

}
