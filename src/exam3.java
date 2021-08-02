

import java.util.ArrayList;
import java.util.Scanner;

public class exam3 {
	
	//회문문자열 비교
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> s = new ArrayList<String>();
		
		String str = scan.next();
		String answer = "No";
		
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer = "Yes";
		
		
		
		System.out.println(answer);
		
	}	
}
