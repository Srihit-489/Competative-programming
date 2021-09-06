import java.util.*;
import java.lang.*;

public class LFM{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
		    int n = scanner.nextInt();
			if(n%4 == 0){
				  System.out.println(n/2 + " "+n/2);
			}else{
				  if(n%2 == 0){
						int a = n/2 - 1;
						int b = n/2 + 1;
						System.out.println(a+" "+b);
				  }else{
						function(n);
				  }
					  
			}
	  }

	  public static void function(int n){
			int  a = n/2;
			while(!(a%2 == 1 && a%3 == 0)){
				  a++;
			}

		   System.out.println(a +" "+(n - a));
	  }

	  
}
