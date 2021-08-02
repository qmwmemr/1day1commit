

import java.util.ArrayList;
import java.util.Scanner;

public class exam5 {
	
	//유효한 팰린드롬
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();

		int answer = 0;
		
		for(char x : str.toCharArray()) {
			if(x>=48 && x<=57) {
				answer = answer * 10 + (x - 48);
			}
		}
		
		System.out.println(answer);
		
	}	
}
