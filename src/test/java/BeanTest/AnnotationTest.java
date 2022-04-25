package BeanTest;

import javax.naming.Context;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myohtet.bean.anno.MyService;

public class AnnotationTest {
	
	@Test
	void test() {
		
		try(var context = new AnnotationConfigApplicationContext()){
			 
			context.scan("com.myohtet.bean.anno");
			
			context.registerBeanDefinition("myNumber", getNumber());
			context.refresh();
			
			var bean = context.getBean("defaultService",MyService.class);
		}
	}

	private BeanDefinition getNumber() {
		
		var myNumber = new GenericBeanDefinition();
		myNumber.setBeanClass(Integer.class);
		myNumber.setFactoryMethodName("parseInt");
		var args = new ConstructorArgumentValues();
		args.addGenericArgumentValue("100");
		myNumber.setConstructorArgumentValues(args);
		return myNumber;
	}

}
