package in.sp.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

import org.springframework.context.ApplicationContext;
public class Main {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
		Student std=(Student)context.getBean("stdID");
		std.display();
	}

}
