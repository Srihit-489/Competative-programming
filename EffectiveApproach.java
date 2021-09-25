import java.lang.*;
import java.util.*;

public class a{
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		int n = scanner.nextInt();
		scanner.nextLine();
		
		String[] arr = scanner.nextLine().split(" ");
		
		int q = scanner.nextInt();
		scanner.nextLine();
		
		String[] quaries = scanner.nextLine().split(" ");
		
		HashMap<Integer,Integer> myhash = new HashMap<>();
		for(int i = 0;i<arr.length;i++){
			int  val = Integer.parseInt(arr[i]);
			myhash.put(val,i+1);
		}
		long a = 0,b = 0;
	//	HashSet<Integer> completed = new HashSet<Integer>();
		
		for(int i = 0;i<q;i++){
			int num = Integer.parseInt(quaries[i]);
		//	if(completed.contains(num))
			//   continue;
			a += (long)myhash.get(num);
			b += (long)n - myhash.get(num)+1;
			//completed.add(num);
		}
		System.out.println(a+" "+b);
		
		
		
    }
   
  
   
}
