import java.lang.*;
import java.util.*;

public class Bit{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int t = scanner.nextInt();
			int count = 0;
			while(t != 0){
				  String str = scanner.next();
				  if(str.charAt(0) == '+' || str.charAt(1) == '+'){
						count++;
				  }else{
						count--;
				  }
				  t--;
			}
			System.out.println(count);
	  }
}
