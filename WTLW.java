import java.lang.*;
import java.util.*;

public class WTLW{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int t = scanner.nextInt();
			while(t!=0){
				  function();
				  t--;
			}
	  }

	  public static void function(){
			String str = scanner.next();
			if(str.length() <= 10){
				  System.out.println(str);
				  return;
			}else{
				char start = str.charAt(0);
				char end = str.charAt(str.length()-1);
				int len = str.length()-2;
				String finalstr = ""+  start + len + end;
				  System.out.println(finalstr);
						  return;
			}
	  }
}
