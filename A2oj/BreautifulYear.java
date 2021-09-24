import java.lang.*;
import java.util.*;

public class a{
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		int n = scanner.nextInt();
	    int runner = n+1;
	    while(true){
			if(fun(runner)){
				System.out.println(runner);
				return;
			}
			runner++;
		}
		
	}
	
	public static boolean fun(int runner){
		HashSet<Integer> myhash = new HashSet<Integer>();
		while(runner != 0){
			int val = runner%10;
			if(myhash.contains(val))
			   return false;
			else 
			   myhash.add(val);
			runner = runner/10;
		}
		return true;
	}
	
}
//Beautiful Year
