import java.util.Scanner;

public class Exponent {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a,n;
         a = scanner.nextInt();
         n = scanner.nextInt();
         System.out.println(getpower(a,n));
    }

    public static long getpower(int a,int n){
        long res = 1;
        while(n != 0){
            if(n%2 == 1){
                res = res*a;
                n--;
            }else{
                a *= a;
                n = n/2;
            }
        }
        return res;
    }


}
