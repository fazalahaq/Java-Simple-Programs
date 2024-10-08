package unierp;

import java.util.Scanner;

public class AddMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Shivam";
		add();
		add(name);
		add(9,90);
		sub(90,9);
		mul(12,10);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter age please :  ");
		 int age = sc.nextInt();
		 age(age);
		
		
	}
	
	public static void add () {
		System.out.println("add  method");
	} 

	public static void add (String abc) {
		System.out.println("add  method :"+ abc);
	}
	
	public static void add (int a,int b) {	
		int c= a+b;
		System.out.println("the sum of x and b is:  " + c);
		
	}
	
	public static void sub(int a , int b) {
		int c= a-b;
		System.out.println("The subtraction of both the values are : " + c);
	}
	public static void mul(long a, long b)
	{
		long c= a*b;
		System.out.println("the multiplication of both the value is :"+ c);
	}
	
	public static void age(int a) {
		
		if( a>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("not eligible to vote");
		}
	}
}