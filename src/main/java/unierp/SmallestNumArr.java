package unierp;

import java.util.Arrays;

/*public class SmallestNumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {100,200,300,45,678,873,};
		int smallest = arr[0];
		
		for(int i =0; i< arr.length; i++) {
			if (arr[i]<smallest) {
				smallest= arr[i];
			}
			
		}
		System.out.print("The smallest number in the given array is :" + smallest);
	}

}*/

public class SmallestNumArr{
	public static void main(String[] argu) {
		int arr [] = new int[5];
		arr[0]= 100;
		arr[1]= 200;
		arr[2]= 900;
		arr[3]= 67;
		arr[4]= 78;
		
//		int smallest = arr[0];
//		for(int i= 0; i<arr.length; i++) {
//			if(arr[i]<smallest) {
//				smallest= arr[i];
//			}
//		}
		
		 Arrays.sort(arr);
		 
		System.out.println("The smallest number in the given array is : " + arr[0]);
	}
}
