import java.lang.*;
import java.util.*;

public class FF{
	public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
		int n = scanner.nextInt();
		  
        HashSet<List<Integer>>   myhash = new HashSet<List<Integer>>();
	    int count =1;
		int max = 1;
	    for(int i=0;i<n;i++){
		    	int hr = scanner.nextInt();
				int min = scanner.nextInt();
				List<Integer> newlist = new ArrayList<Integer>();
				newlist.add(hr);
				newlist.add(min);
				if(myhash.contains(newlist)){
					count++;
					max = Math.max(max,count);
	            }else{
					  myhash.add(newlist);
					  count = 1;
				}
	   }
	   System.out.println(max);
	  }
}
