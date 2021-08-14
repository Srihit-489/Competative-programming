import java.util.*;
import java.lang.*;

class SearchString{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			String str1 = scanner.nextLine();
			String str2 = scanner.nextLine();
			int runner1  = 0;
			int runner2  = 0;
			List<Integer> mylist = new ArrayList<Integer>();
			for(int i = 0 ;i < str1.length();i++){
                  runner1 = i;
				  while(runner1 < str1.length() && str1.charAt(runner1) == str2.charAt(runner2)){
						if(runner2 == str2.length()-1){
							  mylist.add(i);
							  break;
						}
						runner1++;
						runner2++;
				  }
				  runner2 = 0;
			}
			for(int i : mylist)
				System.out.print(i+" ");
			System.out.println();
	  }
}
