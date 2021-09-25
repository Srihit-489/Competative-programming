import java.lang.*;
import java.util.*;

public class a{
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
	   int n = scanner.nextInt();
	   scanner.nextLine();
	   int count = 0;
	   int max = 0;
	   for(int i = 0;i<n;i++){
		   String[] in = scanner.nextLine().split(" ");
		   count -= Integer.parseInt(in[0]);
		   count += Integer.parseInt(in[1]);
		   max = Math.max(count,max);
	   }
	   System.out.println(max);
	 
   }
   
  
   
}

//Tram
