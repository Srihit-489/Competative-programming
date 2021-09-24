//Q1

import java.lang.*;
import java.util.*;

public class a{
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		int n = scanner.nextInt();
		scanner.nextLine();
		int[] arr = new int[]{0,0,0};
		for(int j = 0;j<n;j++){
			String[] in = scanner.nextLine().split(" ");
			for(int i = 0;i<3;i++)
			     arr[i] += Integer.parseInt(in[i]);
		}
		
		for(int i = 0;i<3;i++){
			if(arr[i] != 0){
				System.out.println("NO");
				return;
			}
			  
		}
		System.out.println("YES");
	}
	
}
