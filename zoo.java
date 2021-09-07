import java.lang.*;
import java.util.*;

public class a{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
	 int num = scanner.nextInt();
		if(num >= 0)
		   System.out.println(num);
		else{
			StringBuilder sb = new StringBuilder(Integer.toString(num));
			if(sb.length() == 2)
			    System.out.println(sb.toString());
			else{
				 if(Character.getNumericValue(sb.charAt(sb.length()-1)) > Character.getNumericValue(sb.charAt(sb.length()-2))){
					 sb.deleteCharAt(sb.length()-1);
				 }else{
					 sb.deleteCharAt(sb.length()-2);
				 }
				 int result = Integer.parseInt(sb.toString());
				 System.out.println(result);
			}
			
		}
		
	}
}
