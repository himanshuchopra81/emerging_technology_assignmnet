package activity;

import java.util.Scanner;

public class Activity2{
	public static void main(String args[]) {
		char anss = 0;
		do {
		Scanner in = new Scanner(System.in);
		System.out.println("1. Write a program in Java to display the multiplication table of a given integer. ");
		System.out.println("2. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer. ");
		System.out.println("3. Write a program in Java to display the n terms of odd natural number and their sum");
		System.out.println("4. Write a Java program that reads an integer and check whether it is negative, zero, or positive.");
		System.out.println("5. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.");
		
		int act = in.nextInt();
	
		switch(act) {
			case 1:{
				int no = in.nextInt();
				printTable(no);
				break;
			} 
			case 2: {
				int no = in.nextInt();
				int no1 = in.nextInt();
				int no2= in.nextInt();
				System.out.println(checkIfEqual(no, no1, no2));
				break;
			}
			case 3:{
				int no = in.nextInt();
				printOdd(no);
				break;
			}
			case 4:{
				int no= in.nextInt();
				System.out.println(checkNumber(no));
				break;
			}
			case 5:{
				
				checkNumberIfDivisible();
				break;
			}
			default:{
				System.out.println("Enter correct number");
			}
		}
		System.out.println("Do you want to continue(y/n)?");
		anss = in.next().charAt(0);
		}
		while(anss =='y' || anss == 'Y');
			
		
		
	}
	public static void printTable(int n) {
		for(int i=1; i<=10; i++)
			System.out.println(n+ " * " + i + " = " + n*i);
	}
	public static boolean checkIfEqual(int no, int no1, int no2) {
		return no + no1==no2;
	}
	public static void printOdd(int no) {
		int c=0;
		for(int i=0; i<no; i++) {
			if(i%2!=0) {
				System.out.println("odd numbers are: "+i);
				c+=i;
			}
			
		}
		System.out.println("Sum is : "+c);
	}
	
	public static String checkNumber(int no) {
		if(no>0)
			return "positive";
		else if(no<0)
			return "negative";
		else
			return "zero";
	}
	
	public static void checkNumberIfDivisible() {
		for(int i=1; i<=100; i++) {
			
			if(i%5==0 && i%3==0) {
				System.out.println(i);
			}
		}
	}
}
