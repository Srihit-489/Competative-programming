import java.lang.*;
import java.util.*;

class Primefactorization{
	 public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int n = scanner.nextInt();
			for(int i=2;i*i<=n;i++){
				  if(n%i == 0){
					   int count = 0;
						while(n%i == 0){
							  n = n/i;
							  count++;
						}
						System.out.print(i+"^"+count+" ");

				  }
			}
			if( n > 1){
				  System.out.println(n+"^1");
				  return;
			}
			System.out.println();
			scanner.close();
			return;

	  }
}
