import java.lang.*;
import java.util.*;

public class a{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		int t = scanner.nextInt();
		scanner.nextLine();
		
		while(t != 0){
			t--;
			function();
		}
		
	}
	public static void function(){
		int n = scanner.nextInt();
		scanner.nextLine();
		
		String str = scanner.nextLine();
		int sum = 0;
		boolean start = false;
		int count = 0;
		for(int i  =0;i<str.length();i++){
			if(str.charAt(i) != '0'){
				count++;
				int val = (int)(str.charAt(i) - '0');
				sum = sum + val;
			}
		}
		if(str.charAt(n-1) != '0')
			start = true;
	    int ans = 0;
		if(start)
			ans = sum + count -1;
		else
		    ans = sum + count;
		System.out.println(ans);
		
		
	}
}
