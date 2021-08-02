

import java.util.ArrayList;
import java.util.Scanner;

public class exam2 {
	
	//중복문자제거
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> s = new ArrayList<String>();
		
		String input = scan.next();
		String answer = "";	
		for(int i=0; i<input.length(); i++) {
			if(input.indexOf(input.charAt(i))==i) {
				answer += input.charAt(i);
			}
		}
		
		System.out.println(answer);
		
		
	}	
}
