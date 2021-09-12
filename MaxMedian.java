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
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if(num1 == 1){
			System.out.println(num2);
			return;
		}
		
		if(num1%2 == 0){
			int newsize = num1/2 + 1;
			int ans = num2/newsize;
			System.out.println(ans);
		}else{
			int newsize = (num1-1)/2;
			newsize = num1 - newsize;
			int ans = num2/newsize;
			System.out.println(ans);
			
		}
	}
	
}
