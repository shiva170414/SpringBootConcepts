package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	
	public static void main(String args[]) {
		//String configLoc="/in/sp/resource/applicationContextFile.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext("in/sp/resource/applicationContextFile.xml");
		Student std=(Student)context.getBean("stId");
		std.display();
	}

}
