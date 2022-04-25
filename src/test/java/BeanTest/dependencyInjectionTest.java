package BeanTest;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.myohtet.bean.di.Employee;
import com.myohtet.bean.di.EmployeeService;

public class dependencyInjectionTest {
	
	@Test
	void test_width_constructor() {
		
		try( var context = new GenericXmlApplicationContext("classpath:di-demo.xml")){
			
			var service = context.getBean(EmployeeService.class);
			
			var e = new Employee();
			
			e.setName("Aung Aung");
			e.setEmail("myohtet.cu2014@gmail.com");
			
			service.create(e);
			
		}
		
	}

}
