package com.myohtet.bean;

public class ZooInstanceFactory {
	
	public enum Type {
		
		DEFAULT,SMALL,BIG
	}
	
	private Type type;

	public ZooInstanceFactory(Type type) {
		super();
		this.type = type;
	}
	
	public Zoo getZoo() {
		
		return switch(type) {
		case SMALL -> new Zoo(10);
		case BIG   -> new Zoo(100);
		case DEFAULT -> new Zoo(50);
		};
	}
    
	public  Zoo getZoo(int count) {
		
		return new Zoo(count);
		
	}
}
