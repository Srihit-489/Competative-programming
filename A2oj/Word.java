import java.lang.*;
import java.util.*;

public class a{
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		String str = scanner.nextLine();
		int count = 0;
		for(int i = 0;i<str.length();i++){
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			   count++;
		}
		int revcount = str.length()-count;
		if(count >= revcount){
			System.out.println(str.toLowerCase());
		}else{
			System.out.println(str.toUpperCase());
		}
   }
	
}

// Word
