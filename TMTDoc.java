import java.lang.*;
import java.util.*;

public class b{
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
		int n = scanner.nextInt();
		scanner.nextLine();
        if(n%3 != 0){
			System.out.println("NO");
			return;
		}
		String str = scanner.nextLine();
		int count = 0;
		int ideal = str.length()/3;
		for(int i = 0;i < n;i++){
			count += getval(str.charAt(i));
			if(count > ideal){
				System.out.println("NO");
				return;
			}else if(count < 0){
				System.out.println("NO");
				return;
			}
		}
		
		if(count == ideal)
		    System.out.println("YES");
		else
		    System.out.println("NO");
		    
		return;
		
		
		
	}
	
	public static int getval(char ch){
		return ch == 'T'? 1 : -1;
	}
	
	
}
