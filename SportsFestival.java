import java.lang.*;
import java.util.*;

public class Prac{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
         int n = scanner.nextInt();
         scanner.nextLine();
         long[][] data = new long[n][n];
         String[] in = scanner.nextLine().split(" ");
         int[] arr = new int[n];
         for(int i = 0;i<n;i++){
			 arr[i] = Integer.parseInt(in[i]);
		 }
		 Arrays.sort(arr);
		 long getans = get(arr,0,n-1,data);
		 System.out.println(getans);
 
	}
	
	public static long get(int[] arr,int start,int end,long[][] data){
		if(data[start][end] != 0){
			return data[start][end];
		}
		if(start == end)
		   return 0;
		else{
			long dif = (long)(arr[end] - arr[start]);
			long minval = Math.min(get(arr,start+1,end,data),get(arr,start,end-1,data));
			data[start][end] = dif+minval;
			return data[start][end];
		}
		  // return arr[end] - arr[start] + Math.min();
	}
	
	
	
	
	
}
