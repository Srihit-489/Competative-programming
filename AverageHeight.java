 import java.lang.*;
 import java.util.*;
 
 public class a{
	 public static Scanner scanner = new Scanner(System.in);
	 public static void main(String[] args){
		 int t = scanner.nextInt();
		 scanner.nextLine();
		 
		 while(t != 0){
			 t--;
			 function();
		 }
	 }
	 
	 public static void function(){
		 int n = scanner.nextInt();
		 scanner.nextLine();
		 
		 String[] input = scanner.nextLine().split(" ");
		 Queue<Integer> set1 = new LinkedList<Integer>();
		 Queue<Integer> set2 = new LinkedList<Integer>();
		 for(String str : input){
			 int num = Integer.parseInt(str);
			 if(num%2 == 1)
			     set1.add(num);
			 else
			      set2.add(num);
		 }
		 StringBuilder sb = new StringBuilder();
		 while(set1.size() != 0){
			 int num = set1.remove();
			 sb.append(num);
			 sb.append(" ");
		 }
		 while(set2.size() != 0){
			 int num = set2.remove();
			 sb.append(num);
			 sb.append(" ");
		 }
		 System.out.println(sb);
	 }
 }
