import java.lang.*;
import java.util.*;

public class a{
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
	     int n = scanner.nextInt();
	     scanner.nextLine();
	     
	     String str = scanner.nextLine();
	     int count = 0;
	     for(int i = 0;i<str.length()-1;i++){
			 if(str.charAt(i) == str.charAt(i+1))
			     count++;
		 }
		 System.out.println(count);
   }
	
}

// Stones On The Table
