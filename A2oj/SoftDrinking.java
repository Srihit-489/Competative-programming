import java.lang.*;
import java.util.*;

public class a{
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
	   int n = scanner.nextInt();
	   int k = scanner.nextInt();
	   int l = scanner.nextInt();
	   int c = scanner.nextInt();
	   int d = scanner.nextInt();
	   int p = scanner.nextInt();
	   int nl = scanner.nextInt();
	   int np = scanner.nextInt();
	   
	   int t1 = k*l/n;
	   int t2 = c*d;
	   int t3 = p/np;
	   int temp = Math.min(t1,t2);
	   temp = Math.min(temp,t3);
	   temp = temp/n;
	   System.out.println(temp);
	  
    }
   
  
   
}

//Soft Drinking
