import java.lang.*;
import java.util.*;

public class b{
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int np = 0;
		for(int i = n+1;i<=m;i++){
			if(isPrime(i)){
				np = i;
				break;
			}
		}
		
		if(np == m)
		  System.out.println("YES");
		else
		  System.out.println("NO");
	}
	
	public static boolean isPrime(int n){
		for(int i = 2;i*i<=n;i++){
			if(n%i == 0)
			   return false;
		}
		return true;
	}
	
}

// 
