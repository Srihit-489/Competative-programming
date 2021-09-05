import java.util.*;
import java.lang.*;

public class Q1{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
	      int t = scanner.nextInt();
		  while(t != 0){
				t--;
				function();
		  }
	  }

	  public static void function(){
			int n = scanner.nextInt();
			String str = scanner.next();
			for(int i = 0;i<str.length();i++){
				  if(str.charAt(i) == 'U'){
						System.out.print("D");
				  }else if(str.charAt(i) == 'D'){
						System.out.print("U");
				  }else{
						System.out.print(str.charAt(i));
				  }
			}
			System.out.println();
	  }
}
