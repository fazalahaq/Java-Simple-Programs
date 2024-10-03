package unierp;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayCombinedProgram {

	public static void main(String[] args) {
		
		
		// input of the size of the array
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the size of an array ");  
		int size =sc.nextInt();  
		int arr[]= new int [size];
		
		//entering the number in the array
		for(int i=0; i<size; i++) {
			System.out.print("enter the numbers in array");
			arr[i]= sc.nextInt();
		}
		
		//length of an array
		System.out.println("The length of the created array is : "+ arr.length);
		
		int sum =0;
		//printing using for each loop
		for (int  x: arr) {
			System.out.println("The numbers stored in array are: " + x);
			sum = sum+x;	
			}
		//addition of an array	
		
				
//				for (int i=0; i<arr.length; i++) {
//					int sum = arr[i] + sum;
//					System.out.println(sum);
		//		}
				
		System.out.println("Addsion of array is "+ sum);
		//First number printing
		System.out.println("the first number stored in array is: " + arr[0]);
		
		
		//Last number printing
		int a = arr.length-1;
		System.out.println("the last number stored in array is: " + arr[a] );
		
		
		

}}
