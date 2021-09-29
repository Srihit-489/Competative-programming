import java.lang.*;
import java.util.*;

public class a{
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		int n = scanner.nextInt();
		scanner.nextLine();
		
		String[] in = scanner.nextLine().split(" ");
		List<Integer> mylist = new ArrayList<Integer>(n);
		for(String num : in){
			mylist.add(Integer.parseInt(num));
		}
		int min = Collections.min(mylist);
		int max = Collections.max(mylist);
		long num1 = (long)Collections.frequency(mylist,min);
		long num2 = (long)Collections.frequency(mylist,max);
		long num = num1*num2;
		if(min == max){
			long res = (long)n;
			long p = n*(n-1)/2;
			System.out.println("0 "+p);
			return;
		}
		System.out.println((max-min)+" "+num);
		
    }
   
  
   
}
