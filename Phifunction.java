import java.util.*;
import java.lang.*;

class nt{
	public static Scanner scanner = new Scanner(System.in);
	static int n = 100000000;
	static boolean[] data = new boolean[n+1];
	
	public static void main(String[] args){
		for(int i = 2;i*i < n;i++){
			if(!data[i]){
				for(int j = i*i;j < n ; j+=i){
					data[j] = true;
				}
			}
		}
		
		int[] count = new int[n+1];
		count[1] = 0;
		for(int i = 2;i<n+1;i++){
			int current = !data[i]?1:0;
			count[i] = count[i-1]+current;
		}
		while(true){
			double num = scanner.nextDouble();
			if(num == 0)
			   break;
			 int modified = (int)num;
			double term = num/Math.log(num);
			double val = ((double)count[modified] - term)/(double)count[modified];
			val = val*100;
			double percent = Math.abs(val);
			System.out.printf("%.1f\n",percent);
		}
	}
}
