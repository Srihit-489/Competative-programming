import java.lang.*;
import java.util.*;

public class a{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		int t = scanner.nextInt();
		scanner.nextLine();
		
		while(t > 0){
			t--;
			function();
		}
	}
	
	public static void function(){
		int n = scanner.nextInt();
		scanner.nextLine();
		
		List<String> mylist = new ArrayList<String>();
		getans(0,0,new StringBuilder(),mylist,n);
		for(String s : mylist){
			System.out.println(s);
		}
	}
	
	public static void getans(int x,int y,StringBuilder sb,List<String> mylist,int n){
		if(mylist.size() == n)
		   return;
		if(x == n && y == n){
			String str = sb.toString();
			if(!mylist.contains(str))
			     mylist.add(str);
			 return;
		}
		
		if(x == y){
		   StringBuilder newsb = new StringBuilder(sb);
		   newsb.append('(');
		   getans(x+1,y,newsb,mylist,n);	
		}else if(x == n){
			StringBuilder newsb = new StringBuilder(sb);
			newsb.append(')');
			getans(x,y+1,newsb,mylist,n);
		}else if(x > y){
			StringBuilder newsb = new StringBuilder(sb);
			newsb.append(')');
			getans(x,y+1,newsb,mylist,n);
			StringBuilder newsb2 = new StringBuilder(sb);
			newsb2.append('(');
			getans(x+1,y,newsb2,mylist,n);
		}
	}
}
