import java.util.*;
import java.lang.*;
import java.math.*;

class nt{
	
	static BigInteger[] arr = new BigInteger[1000];
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		int t = scanner.nextInt();
		for(int i = 0;i<t;i++)
		    function();
	}
	
	public static long GCD(long a,long b){
		if(b == 0)
		  return a;
		else return GCD(b,a%b); 
	}
	
	public static long ncr(long n,long r){
		long a = 1;
		long b = 1;
		
		if(n-r < r)
		   r = n-r;
		
		if(r != 0){
			while(r != 0){
				a = a*n;
				b = b*r;
				
				long gcd = GCD(a,b);
				
				a = a/gcd;
				b = b/gcd;
				
				n--;
				r--;
				
			}
			
			a = a/b;
		}else{
			a = 1;
		}
		
		return a;
	}
	
	public static void function(){
		long n = scanner.nextLong();
		long k = scanner.nextLong();
		n--;
		k--;
		
		long ans = ncr(n,k);
		
		System.out.println(ans);
	}
	
	
}
