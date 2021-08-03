package exam20;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class exam29 {
	
	//올바른 괄호
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		
		String answer = "";
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char x : str.toCharArray()) {
			if(x==')') {
				while(stack.pop()!='(');
			}else {
				stack.push(x);
			}
			
		}
		
		for(int i =0; i < stack.size(); i++) {
			answer+= stack.get(i);
		}
		
		System.out.println(answer);
	}
	}	









