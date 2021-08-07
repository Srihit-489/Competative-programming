import java.lang.*;
import java.util.*;

class Pf{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int t = scanner.nextInt();
			int n = 1000000;
			int[] arr = new int[n+1];
			arr[1] = 1;
			for(int i=2;i*i<n;i++){
				 if(arr[i] == 0){
					  arr[i] = i;
					  for(int j=i*i;j<n;j+=i){
							if(arr[j] == 0)
								arr[j] = i;
					  }
				 }
			}

			while(t != 0){
				  function(arr);
				  t--;
			}
	  }

	  public static void function(int[] arr){
		 int n = scanner.nextInt();
		 while(n != 1){
			  int count = 0;
			  int num = arr[n];
			  while(n%num == 0 && n > 1){
					count++;
					n = n/num;
			  }
			  System.out.print(num+"^"+count+" ");
		 }
		 System.out.println();

	  }
}
