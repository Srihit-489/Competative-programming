import java.util.*;
import java.lang.*;

public class Lucky{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			int n = scanner.nextInt();
			int exit = 0;
			int size = Integer.toString(n).length();
			List<Integer> mylist  =  new ArrayList<>();
			getlist(mylist,size,new StringBuilder());
			for(int num : mylist){
				  if(n%num ==  0){
						System.out.println("YES");
						exit = 1;
						break;
				  }
			}
			if(exit == 0)
		    	System.out.println("NO");
	  }

	  public static void getlist(List<Integer> mylist,int size,StringBuilder sb){
			if(size == 0)
				return;
			sb.append(4);
			mylist.add(Integer.parseInt(sb.toString()));
			getlist(mylist,size-1,sb);
			sb.deleteCharAt(sb.length()-1);
			sb.append(7);
			mylist.add(Integer.parseInt(sb.toString()));
			getlist(mylist,size -1,sb);
			sb.deleteCharAt(sb.length()-1);
	  }
}
