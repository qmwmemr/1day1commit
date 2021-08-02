

import java.util.ArrayList;
import java.util.Scanner;

public class exam8 {
	
	//암호
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String str = scan.next();

		String answer = "";
		
		for(int i = 0; i<n; i++) {
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp,2);
			answer += (char)num;
			System.out.println(tmp+" " + num);
			str = str.substring(7);
		}
		
		
		System.out.println(answer);
	}	
}
