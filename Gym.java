import java.util.*;
import java.lang.*;

class Gym{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] main){
		  int n = scanner.nextInt();
		  int[] arr = new int[n];
		  for(int i=0;i<arr.length;i++){
				int val = scanner.nextInt();
				arr[i] = val;
		  }

		  int count1 = 0;
		  int count2 = 0;
		  int count3 = 0;
		  

		  for(int i=0;i<n;i+=3){
				count1 = count1+arr[i];
				if(i+1 < n)
				count2 = count2+arr[i+1];
				if(i+2 < n)
				count3 = count3+arr[i+2];
		  }
		  if(count1 > count2){
			  if(count1 > count3)
				  System.out.println("chest");
			  else
				  System.out.println("back");

		  }else{
				if(count2 > count3)
					System.out.println("biceps");
				else
					System.out.println("back");
		  }
		  
	  }
}

