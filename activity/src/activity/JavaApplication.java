package activity;

import java.util.Scanner;

public class JavaApplication {
	public static void main(String args[]) {
		char anss = 0;
		do {
		Scanner in = new Scanner(System.in);
		System.out.println("Which activity you want to execute?");
		System.out.println("1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.");
		System.out.println("2. Write a Java program to print the sum of two numbers.");
		System.out.println("3. Write a Java program to divide two numbers and print on the screen.");
		System.out.println("4. Write a Java program that takes two numbers as input and display the product of two numbers.");
		System.out.println("5. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.");
		System.out.println("6. Write a Java program to print the area and perimeter of a circle.");
		System.out.println("7. Write a Java program that takes three numbers as input to calculate and print the average of the numbers");
		System.out.println("8. Write a Java program to print the area and perimeter of a rectangle.");
		System.out.println("9. Write a Java program to swap two variables.");
		
		int act = in.nextInt();
	
		switch(act) {
			case 1:{
				System.out.println("Hello\nHimanshu Chopra");
				break;
			} 
			case 2: {
				System.out.println("Sum is:"+sum(74, 36));
				break;
			}
			case 3:{
				System.out.println("Result is:"+divide(50, 3));
				break;
			}
			case 4:{
				
				System.out.println("Enter two number");
				int a = in.nextInt();
				int b = in.nextInt();
				System.out.println("Result is:"+multiply(a, b));
				break;
			}
			case 5:{
				
				System.out.println("Enter two number to find sum, multiply, subtract, divide and remainder ");
				int a = in.nextInt();
				int b = in.nextInt();
				System.out.println("Sum is:"+sum(a, b));
				System.out.println("Multiplication is:"+multiply(a, b));
				System.out.println("Division is:"+divide(a, b));
				System.out.println("Remainder is:"+remainder(a, b));
				break;
			}
			case 6:{
				
				System.out.println("Enter radius to print the area and perimeter of a circle.");
				double rad = in.nextInt();
				double perimeter = 2 * Math.PI * rad;
		        double area = Math.PI * rad * rad;
		        System.out.println("Perimeter is = " + perimeter);
		        System.out.println("Area is = " + area);
				break;
			}
			case 7:{
				
				System.out.println("Enter three numbers.");
				int a = in.nextInt();
				int b = in.nextInt();
				int c = in.nextInt();
				System.out.println("Average is = "+ (a+b+c)/3 );
		        break;
			}
			case 8:{
				
				System.out.println("Enter length and width to print the area and perimeter of a rectangle.");
				int length = in.nextInt();
				int width = in.nextInt();
				System.out.println("Area is = "+ length*width );
				System.out.println("Perimeter is = "+ 2*(length+width) );
		        break;
			}
			case 9:{
				
				System.out.println("enter two numbers to swap two variables.");
				int a = in.nextInt();
				int b = in.nextInt();
				a = a+b;
				b = a - b;
				a = a - b;
				System.out.println("a = " + a + " b = " + b );
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
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int divide(int a, int b) {
		return a/b;
	}
	public static int multiply(int a, int b) {
		return a/b;
	}
	public static int remainder(int a, int b) {
		return a%b;
	}


}
