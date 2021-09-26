import java.lang.*;
import java.util.*;

public class a{
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		String[] nk = scanner.nextLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		
		int[] arr = new int[n];
		String[] children = scanner.nextLine().split(" ");
		for(int i =0;i<n;i++){
			double val = Double.parseDouble(children[i]);
			int ceil = (int)Math.ceil(val/k);
			//System.out.println(val+"ceil is "+ceil);
			arr[i] = ceil;
		}		
		int pos = 1;
		int max = arr[0];
		for(int i = 1;i<n;i++){
			if(arr[i] >= max){
				max = arr[i];
				pos = i+1;
			}
		}
		
		System.out.println(pos);
    }
   
  
   
}

// jzzhu and children
