package exam30;


import java.io.CharConversionException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class exam33 {
	
	//공주구하기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int answer = 0;
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i = 1; i<=n; i++) q.offer(i);
		
		while(!q.isEmpty()) {
			for(int i =1; i<k; i++) {
				q.offer(q.poll());
			}
			q.poll();
			if(q.size()==1) answer = q.poll();
		}
		
		System.out.println(answer);
		
		
		
		
		
		
		
		
	}
	}	









