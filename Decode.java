import java.lang.*;
import java.util.*;

public class Prac{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		String str = scanner.nextLine();
		StringBuilder sb = new StringBuilder();
		int runner = 0;
		int n = str.length();
		while(runner < n){
			if(str.charAt(runner) == '.')
			   sb.append(0);
			else{
				if(str.charAt(runner+1) == '.')
				  sb.append(1);
				else
				   sb.append(2);
				runner++;
			}
			runner++;
		}
		System.out.println(sb);
 
	}
	
	public static void function(){
	
	}
	
	
	
	
	
}
