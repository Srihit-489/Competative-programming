import java.lang.*;
import java.util.*;

public class a{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		int n = scanner.nextInt();
		int num = scanner.nextInt();
		int count = 0;
		for(int i =1;i<=n;i++){
			if(num%i == 0 && num/i <= n)
			count++;
		}
		
		System.out.println(count);
		
	}
}
