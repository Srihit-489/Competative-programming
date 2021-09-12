import java.lang.*;
import java.util.*;

public class a{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		 int t = scanner.nextInt();
		 scanner.nextLine();
		 while(t != 0){
			 t--;
			 function();
		 }
	}
	
	public static void function(){
		String str = scanner.nextLine();
		int head = 0;
		char start = str.charAt(0);
		int count = start == '0'? 1: 0;
		
		for(int i = 1;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch == start) continue;
			else{
				start = ch;
				int temp = ch == '0'?1:0;
				count = count+temp;
			}
			
		}
		
		int result = Math.min(2,count);
		System.out.println(result);
	}
	
}
