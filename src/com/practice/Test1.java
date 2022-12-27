package com.practice;

import java.util.Scanner;

public class Test1 {

	public static int add(int num1, int num2) {

		return num1 + num2;

	}

	public static int subtract(int num1, int num2) {

		return num1 - num2;

	}

	public static int multiply(int num1, int num2) {

		return num1 * num2;

	}

	public static int divide(int num1, int num2) {

		return num1 / num2;

	}

	public static void main(String[] args) {

		 Scanner scanner=new Scanner(System.in);  
		 System.out.println("enter the number of option thet u want to perform..!");	
         
         int option = scanner.nextInt();
         int num1=scanner.nextInt();
         int num2=scanner.nextInt();
         if(num1>=num2 && (option==1 || option==2 || option==3 || option==4 ) ) {
        	  
        	 
          }
         else {
   		  System.out.println("num1 should be greater than num2");
   	  }
         
          
          
          scanner.close();
	}
}
