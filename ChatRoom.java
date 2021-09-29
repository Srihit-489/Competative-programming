import java.lang.*;
import java.util.*;

public class a{
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		String str1 = scanner.nextLine();
		
		String str2 = "hello";
		int runner1 = 0;
		int runner2 = 0;
		
		while(runner1 != str1.length() && str2.length() != runner2){
			if(str1.charAt(runner1) == str2.charAt(runner2)){
				runner1++;
				runner2++;
			}else{
				runner1++;
			}
		}
		if(runner2 == str2.length())
		   System.out.println("YES");
		else
		   System.out.println("NO");
    }
   
  
   
}
