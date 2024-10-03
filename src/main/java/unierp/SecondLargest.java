package unierp;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {10,30, 566,53,63,-9};
		int n = arr.length;
		int highest = Integer.MIN_VALUE;
		int SecHighest= Integer.MIN_VALUE;
		
		//Traversing the array
		for(int i =0; i<n; i++) {
			if (arr[i]>highest) {
				SecHighest = highest;
				highest = arr[i];
			}
			
			if(arr[i] < highest && arr[i] > SecHighest) {
				SecHighest= arr[i];
			}
			}
		System.out.println("The Second highest number is" + SecHighest);
		}
	}

//Second approach not applicable if value is duplicated.

/*package unierp;

import java.util.Arrays;

public class SecondLargest {
	
	public static void print2Largest(int arr[]) {
		int size = arr.length;
		Arrays.sort(arr);
		
		System.out.println(arr[size-2]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {10,30, 566,53,63,-9};
		print2Largest(arr);
		}
	}*/