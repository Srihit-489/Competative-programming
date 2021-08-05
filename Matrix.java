import java.lang.*;
import java.util.*;

public class Matrix{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
		   int val = 0;
			for(int i =0;i<5;i++){
				  for(int j=0;j<5;j++){
						int num = scanner.nextInt();
						if(num == 1){
							   val = Math.abs(2-i) + Math.abs(2-j);
						}
				  }
			}
			System.out.println(val);
	  }
}
