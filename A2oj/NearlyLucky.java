import java.lang.*;
import java.util.*;

public class a{
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
	     String str = scanner.nextLine();
	     int count = 0;
	     for(int i = 0;i<str.length();i++){
			 if(str.charAt(i) == '4' || str.charAt(i) == '7')
			   count++;
		 }
		 if(count == 0){
	 	 System.out.println("NO");
          return;
		 }
		 while(count > 0){
			 int val = count%10;
			 if(val != 4 && val != 7){
				 System.out.println("NO");
				 return;
			 }
			 count = count/10;
		 }
		 System.out.println("YES");
	     
	     
   }
	
}

// Nearly Lucky Number
