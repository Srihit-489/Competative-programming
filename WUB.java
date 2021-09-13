import java.lang.*;
import java.util.*;

public class WUB{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			String str = scanner.nextLine();
			String[] words = str.split("WUB");
			StringBuilder sb = new StringBuilder();
			for(String s : words){
			  if(s.equals(""))
			    continue;
			         s.trim();
				  sb.append(s);
				  sb.append(' ');
			}
			System.out.println(sb);
	  }
}
