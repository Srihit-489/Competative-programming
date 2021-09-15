import java.util.*;
import java.lang.*;

public class cfq{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		int n = scanner.nextInt();
		scanner.nextLine();
		//int[] arr = new int[n];
		String[] nums = scanner.nextLine().split(" ");
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int minindex = -1;
		int maxindex = -1;
		for(int i = 0;i<nums.length;i++){
			int current = Integer.parseInt(nums[i]);
			if(current > max){
				max = current;
			    maxindex = i;
			}
			
			if(current <= min){
				min = current;
				minindex = i;
			}
	   }
	   
	   if(minindex < maxindex){
		   int ans = maxindex;
		   ans += n - minindex - 2;
		   System.out.println(ans);
	   }else{
		   int ans = n + maxindex - minindex-1;
		   System.out.println(ans);
	   }
	   
	   
	}
}
