
//Done







import java.lang.*;
import java.util.*;

public class a{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		 int t = scanner.nextInt();
		 scanner.nextLine();
		 while(t != 0){
			 t--;
			 function();
		 }
	}
	
	public static void function(){
		int n = scanner.nextInt();
		scanner.nextLine();
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
	//	HashMap<Integer,Integer> myhash = new HashMap<Integer,Integer>();
	//	myhash.put(0,0);
	//	myhash.put(1,0);
	//	myhash.put(2,0);
	    int ans = 0;
	  //  int track = 0;
	    boolean prevzero = false;
	    boolean prevone = false;
		for(int i = 0;i<n;i++){
			if(str1.charAt(i) != str2.charAt(i)){
				ans+=2;
				prevone = false;
				prevzero = false;
			}else if(str1.charAt(i) == '1'){
				  if(prevzero){
					  prevzero = false;
					  ans+=1;
				  }else{
					  prevone = true;
					  prevzero = false;
				  }
			}else{
				if(prevone){
					ans+=2;
					prevone = false;
				}else{
					 ans+=1;
					 prevzero = true;
				}  
			}
		}
		
		System.out.println(ans);

	}
	
}
