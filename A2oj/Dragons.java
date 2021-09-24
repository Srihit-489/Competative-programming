import java.lang.*;
import java.util.*;

public class a{
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
	     int a = scanner.nextInt();
	     int b  = scanner.nextInt();
	     int c = scanner.nextInt();
	     int d = scanner.nextInt();
	     
	     int n = scanner.nextInt();
	     
	    HashSet<Integer> myhash = new HashSet<Integer>();
	    int[] test = new int[]{a,b,c,d};
	    for(int num : test){
			int runner = num;
			while(runner <= n){
				myhash.add(runner);
				runner+=num;
			}
		}
		int ans = myhash.size();
		System.out.println(ans);
	 
	 
   }
   
}
// Dragons
