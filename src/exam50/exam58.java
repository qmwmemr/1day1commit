package exam50;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam58 {
	
	static int answer = Integer.MIN_VALUE;
	static int n, m ;
	static int[] a,b;
	
	
	public void DFS(int L, int sum, int time) {
		if(time > m) return;
		if(L == n) {
			answer = Math.max(answer, sum);
		}else {
			DFS(L+1, sum+a[L], time+b[L]); //바둑이를 태운다
			DFS(L+1, sum, time); //태우지 않는다
			
		}
	}
	
	//바둑이 승차(DFS)
	public static void main(String[] args) {
		
		exam58 T = new exam58();
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		m = scan.nextInt();
		
		a = new int[n];
		b = new int[n];
		for(int i =0; i<n; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
		}
		
		T.DFS(0, 0, 0);
		System.out.println(answer);
		
		
	}
	}	









