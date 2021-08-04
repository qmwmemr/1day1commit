package exam30;


import java.io.CharConversionException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class exam32 {
	
	//쇠막대기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		
		int answer = 0;
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i)=='(') {
				stack.push(str.charAt(i));
			}else {
				if(str.charAt(i-1)=='(') {
					stack.pop();
					answer+=stack.size();
				}else {
					stack.pop();
					answer+=1;
				}
				
			}
		}
		
		
		System.out.println(answer);
		
		
		
		
		
		
		
		
	}
	}	









