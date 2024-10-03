package unierp;

public class SecSmallestArr {

	public static void main(String[] args) {
		
		int arr []= {10,30,5,6, 566,53,63,-9};
		int n = arr.length;
		int smallest = Integer.MAX_VALUE;
		int Secsmallest= Integer.MAX_VALUE;
		
		//Traversing the array
		for(int i =0; i<n; i++) {
			if (arr[i]<smallest) {
				Secsmallest = smallest;
				smallest = arr[i];
			}
			
			if(arr[i] > smallest && arr[i] < Secsmallest) {
				Secsmallest= arr[i];
			}
			}
		System.out.println("The Second smallest number is" + Secsmallest);
	}

}
