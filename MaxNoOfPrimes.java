 import java.lang.*;
import java.util.*;

public class a{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
   int n = scanner.nextInt();
		scanner.nextLine();
		int three = 0;
		
		int count = 0;
		while(n > 1){
			n-=2;
			count++;
		}
		three = n == 0?0:1;
		System.out.println(count);
		for(int i = 0;i<count-1;i++){
			System.out.print("2 ");
		}
		
		if(three == 0)
		   System.out.println("2");
		else
		  System.out.println("3");
		
	}
}
