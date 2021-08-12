import java.util.*;
import java.lang.*;

class MaxSubArray{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			int n = scanner.nextInt();
			long max = Long.MIN_VALUE;
			long sum = 0;
			for(int i=0;i<n;i++){
				  sum += scanner.nextLong();
				  max = Math.max(sum,max);
				  if(sum < 0)
					  sum = 0;
			}
			System.out.println(max);
	  }
}
