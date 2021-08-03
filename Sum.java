import java.lang.*;
import java.util.*;

class Sum{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			System.out.print("Enter the vaue of a and b : ");
			int a = scanner.nextInt();
			int b = scanner.nextInt();

		   System.out.println("Enter the array a ");
		   int[] arr1 = new int[a];
		   for(int i=0;i<a;i++){
				arr1[i] = scanner.nextInt();
		   }
		   System.out.println("Enter the array b ");
		   int[] arr2 = new int[b];
		   for(int i=0;i<b;i++){
				arr2[i] = scanner.nextInt();
		   }
		   System.out.print("Enter the target value :" );
		   int k = scanner.nextInt();
		   HashSet<Integer> myhash = new HashSet<Integer>();
		   for(int i=0;i<a;i++){
				myhash.add(arr1[i]);
		   }
           for(int i=0;i<b;i++){
				if(myhash.contains(k-arr2[i])){
					  System.out.println("The pair is "+(k-arr2[i])+","+arr2[i]);
					  return;
				}
		   }
		   System.out.println("NO such pair");
	  }
}
