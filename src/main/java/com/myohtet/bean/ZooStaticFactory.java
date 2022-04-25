package com.myohtet.bean;

public class ZooStaticFactory {

	public static Zoo factoryDefaultZoo() {
		 
		return new Zoo();
	}
	
	public static Zoo zooCountAnimal(int count) {
		
		return new Zoo(count);
	}
}
