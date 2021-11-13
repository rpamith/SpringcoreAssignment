package springcore3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static ApplicationContext context;
	public static void main(String[] args) {
		 
		context = new ClassPathXmlApplicationContext("bean.xml");
		BankAccount account = (BankAccount)context.getBean("Account");

		System.out.println(account.accountBalance);

		BankAccountcontroller account2 = (BankAccountcontroller)context.getBean("controller");
		account2.deposit(1, 1000);
		
		System.out.println(account2.getBalance(10));
	}


	
}
