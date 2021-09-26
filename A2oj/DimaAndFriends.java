import java.lang.*;
import java.util.*;

public class a{
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		int n = scanner.nextInt();
		scanner.nextLine();
		
		String[] str = scanner.nextLine().split(" ");
		long sum = 0;
		for(String num : str){
			sum+= (long) Integer.parseInt(num);
		}
		long res = sum;
		
		int count = 0;
		for(int i = 1;i<6;i++){
			if((res + i)%(n+1) != 1)
			   count++;
		}
		
		System.out.println(count);
		
		
		
		
    }
   
  
   
}

//Dima And Friends
