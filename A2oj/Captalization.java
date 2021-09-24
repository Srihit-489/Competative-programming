import java.lang.*;
import java.util.*;

public class a{
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
	     String str = scanner.nextLine();
	     String start = str.substring(0,1);
	     start = start.toUpperCase();
	     System.out.println(start+str.substring(1,str.length()));
	     
   }
	
}

//Captalization
