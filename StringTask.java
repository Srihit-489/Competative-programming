import java.util.*;
import java.lang.*;

public class StringTask{
    	public static Scanner scanner  = new Scanner(System.in);
	  public static void main(String[] args){
			String str = scanner.nextLine();
			str =   str.toLowerCase();
			StringBuilder sb = new StringBuilder(str);
			int i = 0;
			while(i<sb.length()){
				  if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u'|| sb.charAt(i) == ' '){
						sb.deleteCharAt(i);

				  }else{
						String temp = "."+sb.charAt(i);
						sb.deleteCharAt(i);
						sb.insert(i,temp);
						i = i + 2;
				  }
			}
			System.out.println(sb.toString());
			scanner.close();

	  }
}
