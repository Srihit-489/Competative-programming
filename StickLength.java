import java.lang.*;
import java.util.*;


class StickLength{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int n = scanner.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++){
				  arr[i] = scanner.nextInt();
			}
			Arrays.sort(arr);
			int median = 0;
			if(n%2 == 1)
				median = arr[(n+1)/2 - 1];
			else
				median = arr[n/2 - 1];
			long sum = 0;
			for(int i=0;i<n;i++)
				sum+=  Math.abs(arr[i] - median);
			System.out.println(sum);
	  }
}
