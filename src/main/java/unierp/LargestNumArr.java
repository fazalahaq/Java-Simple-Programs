package unierp;

/*public class LargestNumArr {
	public static void main(String[] argu) {
	int arr[]= {100,200,10,20,28,60,600};
	int largest= arr[0];
	
	for(int i =0; i<arr.length; i++) {
		if(arr[i]>largest) {
			largest= arr[i];
		}	
	}
	System.out.println(largest);
}
}*/

/*public class LargestNumArr{
	public static void main(String[] argu) {
		int arr[]= {100,200,300,400,800}; //defined array
		int largest= arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largest) { //if array of loop i is greater than largest
				largest = arr[i]; //stored arr if i in var largest
			}
		}
		System.out.println("The largest number in the given array is : " + largest);
	}
}*/


public class LargestNumArr{
	public static void main(String[] argu) {
		int arr[]= {12,13,14,15,39,55,77};
		int largest = arr[0];
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		System.out.print("the largest number is : "+ largest);
	}
}