package springcore;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 

public class QuestionTest {
	

	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Object que = context.getBean("question");
		
		assertEquals(que.getClass().getSimpleName(), "Question");
	}

	private void assertEquals(String simpleName, String string) {
		// TODO Auto-generated method stub
		
	}


}
