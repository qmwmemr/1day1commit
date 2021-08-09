package exam30;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam34 {
	
	//교육과정 설계
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		String b = scan.next();
		
		String answer = "Yes";
		
		Queue<Character> q = new LinkedList<Character>();
		
		for(char x : a.toCharArray()) {
			q.offer(x);
		}
		
		//이거 오류있음(질문남겼으니 확인해보자)
		for(char x: b.toCharArray()) {
			if(x==q.peek()) { 
				q.poll();
			}
			
		}
		
		if(!q.isEmpty()) answer = "NO";
		
		System.out.println(answer);
		
	}
	}	









