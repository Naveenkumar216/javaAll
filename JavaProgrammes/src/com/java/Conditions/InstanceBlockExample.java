package com.java.Conditions;

public class InstanceBlockExample {
	    
	    public void myMethod(){
	    	System.out.println("Method");
	    }

	    {
	        System.out.println("Instance initializer block 1");
	    }
	    
	    {
	        System.out.println("Instance initializer block 2");
	    }
	    
	    static {
	        System.out.println("static block 1");
	    }
	    
	    static {
	        System.out.println("static block 2");
	    }
	    
	    public InstanceBlockExample() {
	        System.out.println("Class constructor");
	    }
	    public static void main(String[] args) {
	    	 System.out.println("Main Method");
	        InstanceBlockExample iib = new InstanceBlockExample();
	        iib.myMethod();
	       
	    }
}
