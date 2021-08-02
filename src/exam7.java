

import java.util.ArrayList;
import java.util.Scanner;

public class exam7 {
	
	//문자열 압축
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();

		String answer = "";
		
		str = str + " ";
		char[] a = str.toCharArray();
		
		int cnt = 1;
		
		for(int i =0; i<str.length()-1;i++) {
			
			if(a[i] == a[i+1]) {
				cnt++;
			}else {
				answer += a[i];
				if(cnt>1) {
					answer += String.valueOf(cnt);
					cnt = 1;
				}
			}
			
		}
		
		System.out.println(answer);
	}	
}
