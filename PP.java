import java.lang.*;
import java.util.*;

public class PP{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			int n = scanner.nextInt();
			if(n%2  == 1){
				  System.out.println("-1");
				  return;
			}
			for(int i=0;i<n;i+=2){
				  System.out.print((i+2)+" "+(i+1)+" " );
			}
			System.out.println();
			
	  }

}
