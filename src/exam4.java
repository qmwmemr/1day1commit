

import java.util.ArrayList;
import java.util.Scanner;

public class exam4 {
	
	//유효한 팰린드롬
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> s = new ArrayList<String>();
		
		String str = scan.nextLine();
		String answer = "No";
		
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		System.out.println(str);
		
		System.out.println(answer);
		
	}	
}
