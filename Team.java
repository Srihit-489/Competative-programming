import java.lang.*;
import java.util.*;


public class Team{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			int t = scanner.nextInt();
			int count = 0;
			while(t != 0){
				int a =scanner.nextInt(),b = scanner.nextInt(),c = scanner.nextInt();
				if(a+b+c >= 2)
					count++;
				t--;
			}
			System.out.println(count);
	  }
}
