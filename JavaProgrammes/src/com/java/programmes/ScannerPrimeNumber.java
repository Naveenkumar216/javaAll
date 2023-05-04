package com.java.programmes;

import java.util.Scanner;

public class ScannerPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter n :");
       int n = sc.nextInt();
        //sc.hasNextLine();
        int i,j;
        for(i=1;i<= n;i++) {
			for (j=2;j<=i;j++) {
				if(i%j == 0)
					break;
		}
			if(i==j)
				System.out.println(j);
	}
	   
	}

}
