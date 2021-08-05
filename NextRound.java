import java.lang.*;
import java.util.*;

public class NextRound{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int n = scanner.nextInt(),k = scanner.nextInt();
			List<Integer> pq  = new ArrayList<Integer>();
			while(n != 0){
				  pq.add(scanner.nextInt());
				  n--;
			}

			Collections.sort(pq,(a,b)->b-a);

			int count = 0;
			int kval = pq.get(k-1);
			while(true){
				  if(pq.size() == 0){
						break;
				  }
				  int val = pq.get(0);
				  pq.remove(0);
				  if(val <= 0 || val <  kval){
						break;
				  }else{
						count++;
				  }
			}

			System.out.println(count);
			scanner.close();
	  }
}
