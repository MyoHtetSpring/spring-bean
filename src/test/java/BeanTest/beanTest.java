package BeanTest;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;



public class beanTest {
	
	@Test
	void test() {
		
		try(var context = new GenericXmlApplicationContext()){
			
			context.load(new ClassPathResource("application.xml"));
			
			context.refresh();
			
			System.out.println(context.getBeanDefinitionCount());
			
			
		}
		
	}

}
