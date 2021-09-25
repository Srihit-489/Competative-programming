import java.lang.*;
import java.util.*;

public class a{
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
	   String str = scanner.nextLine();
	   for(int i = 0;i<str.length();i++){
		   if(str.charAt(i) == 'H' || str.charAt(i) == 'Q' || str.charAt(i) == '9'){
			   System.out.println("YES");
			   return;
		   }
	   }
	   System.out.println("NO");
	  
    }
   
  
   
}
//HQ9+
