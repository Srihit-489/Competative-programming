import java.util.*;
import java.lang.*;

class TwoSum{
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		  int n = scanner.nextInt();
		  int k = scanner.nextInt();
		  List<Integer> mylist = new ArrayList<Integer>();
		  while(n != 0){
			    n--;
				int val = scanner.nextInt();
				if(mylist.contains(k-val)){
					  System.out.println((mylist.indexOf(k-val)+1)+" "+(mylist.size()+1));
					  return;
				}
				mylist.add(val);
		  }
		  System.out.println("IMPOSSIBLE");
	}
}
