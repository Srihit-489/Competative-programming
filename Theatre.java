import java.lang.*;
import java.util.*;

public class Theatre{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			double  n = scanner.nextDouble(),m = scanner.nextDouble(),a = scanner.nextDouble();
			long count = (long)(Math.ceil(m/a) * Math.ceil(n/a));
			System.out.println(count);
      }

}
