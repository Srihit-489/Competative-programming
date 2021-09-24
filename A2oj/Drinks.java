import java.lang.*;
import java.util.*;

public class a{
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
	 int n = scanner.nextInt();
	 scanner.nextLine();
	 
	 String[] str = scanner.nextLine().split(" ");
	 double total = 0;
	 for(String num : str){
		 total += Double.parseDouble(num);
	 }
	 total = total/n;
	 System.out.println(total);
   }
   
   
	
}


//Drinks
