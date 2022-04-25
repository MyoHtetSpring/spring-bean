package com.myohtet.bean.anno;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//This  is called java base configuration
@Configuration
public class MyServiceFactoryJavaBase {
	
	@Bean
	public MyService defaultService(int count) {
		
		return new MyService(count);
	}

}
