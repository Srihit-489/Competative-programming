import java.util.*;
import java.lang.*;

class nt{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		int t= scanner.nextInt();
		scanner.nextLine();
		
	
		for(int i = 0;i<t;i++){
			int n = scanner.nextInt();
			scanner.nextLine();
			
			int val = function(n);
			System.out.println(val);
		}
		
	}
	
	public static int function(int n) {
    int result = n;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            while (n % i == 0)
                n /= i;
            result -= result / i;
        }
    }
    if (n > 1)
        result -= result / n;
    return result;
    }
	
}
