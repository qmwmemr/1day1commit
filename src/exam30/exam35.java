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

public class exam35 {
	
	static class Person {
		int id;
		int priority;
		public Person(int id, int priority) {
			this.id = id;
			this.priority = priority;
		}
	}
	
	//응급실
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int answer = 0;
		
		Queue<Person> q = new LinkedList<>();
		
		for(int i =0; i<n; i++) {
			q.offer(new Person(i, arr[i]));
		}
		
		while(!q.isEmpty()) {
			Person tmp = q.poll();
			for(Person x: q) {
				if(x.priority > tmp.priority) {
					q.offer(tmp);
					tmp = null;
					break;
				}
			}
			if(tmp!=null) {
				answer++;
					
			}
		}
		System.out.println(answer);
		
		
	}
	}	









