package com.java.exception;

public class Test {

	public static void main(String[] args) {
		
	}
		
		public  int main(int b) {
			
			try {
				System.out.println("try blok");
				int a =33/0;
				return 88;
				}
			catch (Exception e) {
				System.out.println("catch block");
				return 77;
			}
			finally {
				System.out.println("finally block");
				return 33;
			}
		
		 }
}
