//I_love_%username%


import java.lang.*;
import java.util.*;

public class a{
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
	    int n = scanner.nextInt();
	    scanner.nextLine();
	    
	    String[] details = scanner.nextLine().split(" ");
	    int max = Integer.parseInt(details[0]);
	    int min = Integer.parseInt(details[0]);
	    int count = 0;
	    for(int i = 1;i<n;i++){
			int current = Integer.parseInt(details[i]);
			if(current > max){
				max = current;
				count++;
			}
			
			if(current < min){
				min = current;
				count++;
			}
		}
		
		System.out.println(count);
	 
	 
   }
   
  
   
}
