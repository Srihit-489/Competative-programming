import java.lang.*;
import java.util.*;

public class Prac{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		String[] in = scanner.nextLine().split(" ");
		int n = Integer.parseInt(in[0]);
		int sum = Integer.parseInt(in[1]);
		int min = 0;
		int max = 0;
		int[][] arr = new int[n][2];
		for(int i = 0;i<n;i++){
			String[] str = scanner.nextLine().split(" ");
			arr[i] = new int[]{Integer.parseInt(str[0]),Integer.parseInt(str[1])};
			min += arr[i][0];
			max += arr[i][1];
		}
		StringBuilder sb = new StringBuilder();
		if(sum >= min && sum <= max){
			System.out.println("YES");
			sum = sum - min;
			for(int i = 0;i<n;i++){
				if(sum > arr[i][1] - arr[i][0]){
					sum -= arr[i][1] - arr[i][0];
					sb.append(arr[i][1]); 
					sb.append(" ");
				}else if(sum != 0){
					sb.append(arr[i][0] + sum);
					sb.append(" ");
					sum = 0;
				}else{
					sb.append(arr[i][0]);
					sb.append(" ");
				}
				   
			}
			System.out.println(sb);
			return;
		}
		System.out.println("NO");
	
 
	}
	
	public static void function(){
	
	}
	
	
	
	
	
}
