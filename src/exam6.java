

import java.util.ArrayList;
import java.util.Scanner;

public class exam6 {
	
	//가장 짧은 문자거리
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();

		char c = scan.next().charAt(0);
		
		int [] arr = new int[str.length()];
		
		int p = 1000;
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i)==c) {
				p=0;
				arr[i] = p;
			}else {
				p++;
				arr[i] = p;
			}
		}
		
		p=1000;
		for(int i = str.length()-1; i>=0 ; i--) {
			if(str.charAt(i)==c) {
				p=0;
			}else {
				p++;
				arr[i] = Math.min(arr[i], p);
			}
		}
		
		
		for(int x : arr) {
			System.out.print(x + " ");
		}
		
		
		
	}	
}
