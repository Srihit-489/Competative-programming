import java.lang.*;
import java.util.*;

public class b{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		int t = scanner.nextInt();
		scanner.nextLine();
		
		while(t > 0){
			t--;
			function();
		}
		
	}
	
	public static void function(){
		int n = scanner.nextInt();
		scanner.nextLine();
		
		String[] str1 = scanner.nextLine().split(" ");
		String[] str2 = scanner.nextLine().split(" ");
		
		HashMap<Integer,Integer> myhash1 = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> myhash2 = new HashMap<Integer,Integer>();
		
		for(int i = 0;i<n;i++)
			myhash1.put(Integer.parseInt(str1[i]),i);
		for(int i = 0;i<n;i++)
		    myhash2.put(Integer.parseInt(str2[i]),i);
		int min = Integer.MAX_VALUE;
		for(int i =1;i<=2*n;i+=2){
			for(int j = i+1;j<=2*n;j+=2){
				min = Math.min(min,myhash1.get(i)+myhash2.get(j));
			}
		}
		System.out.println(min);
	}
	
}
	
	
		
// Not efficeient for large inputs but works well for smaller ones
