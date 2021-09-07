 import java.lang.*;
import java.util.*;

public class a{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		int t = scanner.nextInt();
		scanner.nextLine();
		for(int i = 0;i<t;i++){
		int n = scanner.nextInt();
		scanner.nextLine();
		if(n <= 3){
			System.out.println(1);
		}else if(n%2 == 0){
			System.out.println(n/2);
		}else{
			int num = (n-1)/2;
			System.out.println(num);
		}
	}
		
	}
}
