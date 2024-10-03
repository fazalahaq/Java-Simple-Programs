package unierp;

/*public class Array {
public static void main(String[] argu) {
	int a[]= {2,3,4,5,2,5,8,9,10,11};
	
	System.out.println("Duplicate values");
	for(int i=0; i<a.length; i++) {
		for (int j = i+1; j<a.length; j++) {
			if(a[i]==a[j]) {
				System.out.println(a[i]);
			}
		}
	}
	
}
}*/

/*public class Array{
	public static void main(String[] argu) {
		int a []= {100,200,300, 100,100, 10,10,30,400};
		System.out.println("The duplicate values are");
		for(int i =0; i<a.length;i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
					break;
				}
			}
		}
		}
}*/


public class Array{
	public static void main(String[] argu) {
		int a[]= {10,20,25,30,28,28,30,17};
		System.out.println("Duplicate values are");
		for(int i =0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]){
					System.out.println(a[i]);
				}
			}
			
		}
	}
}


