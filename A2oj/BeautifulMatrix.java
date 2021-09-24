import java.lang.*;
import java.util.*;

public class a{
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		//int arr[][] = new int[5][5];
		int rows = 0;
		int col = 0;
		for(int i = 0;i<5;i++){
			String[] in = scanner.nextLine().split(" ");
			for(int j = 0;j<in.length;j++){
				if(in[j].equals("1")){
					rows = i+1;
					col = j+1;
					break;
				}
			}
		}
		
	    int ans = Math.abs(3-rows) + Math.abs(3-col);
	    System.out.println(ans);
	}
	
}

//Q2
