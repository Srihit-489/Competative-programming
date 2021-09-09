import java.util.*;
import java.lang.*;

class nt{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		int t = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 0;i<t;i++){
			function();
		}
		
		
	}
	
	public static void function(){
		int n = scanner.nextInt();
		scanner.nextLine();
		
		int runner = 5;
		int result = 0;
		int count = 1;
		while(n/runner > 0){
			result += n/runner;
			count++;
			runner = runner*5;
		}
		
		System.out.println(result);
	}
	
	

	
}
