package com.java.programmes;

public class primeNumber {

	public static void main(String[] args) {
		int a = 100,i,j;
		for(i=1;i<= a;i++) {
			for (j=2;j<=i;j++) {
				if(i%j == 0)
					break;
		}
			if(i==j)
				System.out.println(j);
	}

}
}