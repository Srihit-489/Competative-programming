import java.lang.*;
import java.util.*;

public class a{
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
	 String in = scanner.nextLine();
	 List<Character> str = new ArrayList<Character>();
	 for(int i = 0;i<in.length();i+=2){
		 str.add(in.charAt(i));
	 }
	 Collections.sort(str);
	 //Arrays.sort(str);
	 System.out.print(str.get(0));
	 for(int i = 1;i<str.size();i++){
		 System.out.print("+"+str.get(i));
	 }
	    
	 
   }
   
  
   
}

//HelpfulMath
