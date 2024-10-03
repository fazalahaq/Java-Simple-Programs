package unierp;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] arr = new int [] {5, 2, 8, 7, 1};     
	        int temp = 0;    
	            
	         
	        System.out.println("Elements of original array: ");    
	        for (int i = 0; i < arr.length; i++) {     //for originalarray
	            System.out.print(arr[i] + " ");    
	        }    
	            
	    
	        for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     //ascending
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
	          
	        System.out.println();    
	            
	     
	        System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i = 0; i < arr.length; i++) {     //after sorting
	            System.out.print(arr[i] + " ");    
	        }    
	    }      
	}
