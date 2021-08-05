import java.lang.*;
import java.util.*;


public class Domino{
	public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			int r = scanner.nextInt(),c = scanner.nextInt();
			if(r %2 == 0 || c %2 == 0){
				  if(r%2 == 0){
						r = r/2;
						System.out.println(r*c);
						return;
				  }else{
						c = c/2;
						System.out.println(r*c);
				  }
				  return;
			}else{
				  int v = r*c;
				  v = v/2;
				  System.out.println(v);
				  return;
			}
	  }
}
