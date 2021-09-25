import java.lang.*;
import java.util.*;

public class a{
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
	     int n = scanner.nextInt();
	     scanner.nextLine();
	     int a = 0,b = 0;
	     for(int i = 0;i<n;i++){
			 String[] str = scanner.nextLine().split(" ");
			 a += getval(str[0]);
			 b+= getval(str[1]);
		 }
		 int ans = 0;
		 if(a > n - a)
		    ans+= n-a;
		 else
		    ans+= a;
		 if(b > n-b)
		    ans+= n-b;
		 else
		    ans+=b;
		    
		 System.out.println(ans);
	 
	 
   }
   
   public static int getval(String str){
	   return str.equals("1") ? 1 : 0;
   }
   
}

// cupboards
