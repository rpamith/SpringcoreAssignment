package springcore;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {
	
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("springcore.xml");
		Customer cust = (Customer)context.getBean("customerConstructor");
		
		 
		Customer obj2 = new Customer(1, "R P AMITHKUMAR", 987654321,new Address("xyz", "CHITTOOR", "ANDHRAPRADESH", "517403", "India"));
		
		
		if (cust.getCustomerName().equals(obj2.getCustomerName())) {
			System.out.println("Success");
		} else {
			fail("Not yet implemented");
		}
	}

}
