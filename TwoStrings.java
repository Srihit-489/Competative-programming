import java.util.*;
import java.lang.*;

public class StringsPrac{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		int val = s1.compareTo(s2);
		int ans = 0;
		if(val > 0)
		     ans = 1;
		else if(val < 0)
		     ans = -1;
		else
		     ans = 0;
		System.out.println(ans);
	}
}
