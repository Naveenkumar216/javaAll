package com.java.streams;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) {
		
		Class<Person> personClass = null;
		
		try {
			personClass = (Class<Person>) Class.forName("com.java.streams.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
//		Field[] fields = personClass.getDeclaredFields();
//		for(Field f : fields) {
//			f.setAccessible(true);
//			System.out.println(f.getName());
//		}
		
//		Method[] fields = personClass.getDeclaredMethods();
//		for(Method f : fields) {
//			f.setAccessible(true);
//			System.out.println(f.getName());
//		}
		
		//System.out.println(personClass.getPackage());
		
//		Field[] fields = personClass.getFields();
//		for(Field f : fields) {
//			System.out.println(f.getName());
	       //}
		
//			Method[] methods = personClass.getMethods();
//			for(Method m : methods) {
//				System.out.println(m.getName()+" return type:"+m.getReturnType());
//			}
		
		Method[] methods = personClass.getMethods();
		
		for(Method m : methods) {
			if(m.isAnnotationPresent(MyAnnotation.class))
				System.out.println(m.getName());
		}
			
		
	}

}
