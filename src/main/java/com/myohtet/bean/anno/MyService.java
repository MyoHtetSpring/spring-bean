package com.myohtet.bean.anno;

import org.springframework.stereotype.Component;

//This is called Annotation Base Configuration
@Component
public class MyService {

	public MyService() {

		System.out.println("Default Constructor");

	}

	public MyService(int data) {

		System.out.println("Annotation with constructor");
	}

}
