import java.lang.*;
import java.util.*;

public class a{
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		String[] data = scanner.nextLine().split(" ");
		int n = Integer.parseInt(data[0]);
		int t = Integer.parseInt(data[1]);
		
		
		String in = scanner.nextLine();
		char[] arr = in.toCharArray();
		for(int i =0;i<t;i++){
			int j = 0;
			while(j < arr.length-1){
				if(arr[j] == 'B' && arr[j+1] == 'G'){
					arr[j] = 'G';
					arr[j+1] = 'B';
					j = j+2;
				}else{
					j++;
				}
			}
		}
		
		for(int i = 0;i<arr.length;i++)
		   System.out.print(arr[i]);
		
	}
	
}

//Q3
