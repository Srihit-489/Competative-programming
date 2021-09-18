import java.lang.*;
import java.util.*;

public class c{
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
		
		HashMap<Integer,HashSet<Integer>> myhash = new HashMap<Integer,HashSet<Integer>>();
		for(int i = 1;i<=n;i++)
			myhash.put(i,new HashSet<Integer>());
		//boolean[][] arr = new boolean[n+1][n+1];
		int[] count = new int[n+1];
		for(int i = 1;i<=n;i++){
			String[] ar = scanner.nextLine().split(" ");
			if(ar[0].equals("0"))
			  continue;
			  int size = Integer.parseInt(ar[0]);
			for(int j = 1;j<=size;j++){
				int master = Integer.parseInt(ar[j]);
				//arr[i][master] = true;
				count[i]++;
				myhash.get(i).add(master);
			}
		}
		int rounds = 0;
		
		HashSet<Integer> deadmen = new HashSet<Integer>();
		while(true){
			int changes = 0;
		   for(int i=1;i<=n;i++){
			  if(count[i] == 0 && !deadmen.contains(i)){
				   deadmen.add(i);
				  changes++;
				 remove(myhash,i,count,deadmen);
			  }
		   }
		   if(changes == 0){
			   break;
		   }
		   rounds++;
		}
		for(int i =1;i<=n;i++){
			if(count[i] != 0){
				System.out.println(-1);
				return;
			}
		}
		System.out.println(rounds);
		
	}
	
	public static void remove(HashMap<Integer,HashSet<Integer>> myhash,int dead,int[] count,HashSet<Integer> deadmen){
		for(int i = 1;i<count.length;i++){
			if(!deadmen.contains(i) && myhash.get(i).contains(dead)){
				myhash.get(i).remove(dead);
				count[i]--;
			}
		}
	}
	

}
