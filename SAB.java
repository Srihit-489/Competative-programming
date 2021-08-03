import java.lang.*;
import java.util.*;

class SAB{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			System.out.println(getcount(n,k));
	  }

	  public static int getcount(int n,int k){
			if(k == 0){
				  return 1;
			}else if(n == 1){
				  return k+1;
			}else{
				  return getcount(n-1,k-1)+getcount(n-1,k);
			}
	  }
}
