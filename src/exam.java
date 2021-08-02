

import java.util.ArrayList;
import java.util.Scanner;

public class exam {
	
	//특수문자와 알파벳이 섞인 문자열에서 알파벳만 위치 전환
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> s = new ArrayList<String>();
		
		String input = scan.next();
			
		char[] a = input.toCharArray();
		int lt = 0, rt=input.length()-1;
		
		while(lt<rt) {
			if(!Character.isAlphabetic(a[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(a[rt])) {
				rt--;
			}else {
				char tmp = a[lt];
				a[lt] = a[rt];
				a[rt] = tmp;
				lt++;
				rt--;
			}
		}
		String f = a.toString();
		
		System.out.println(a);
		
		
	}	
}
