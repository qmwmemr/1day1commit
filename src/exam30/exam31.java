package exam30;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class exam31 {
	
	//후위식연산
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		
		int answer = 0;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				stack.push(x-48);
			}else {
				int rt = stack.pop();
				int lt = stack.pop();
				if(x=='+') stack.push(lt+rt);
				else if(x=='-') stack.push(lt-rt);
				else if(x=='*') stack.push(lt*rt);
				else if(x=='/') stack.push(lt/rt);
			}
		}
		
		answer = stack.get(0);
	
		System.out.println(answer);
		
		
		
		
		
		
		
		
	}
	}	









