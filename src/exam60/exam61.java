package exam60;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam61 {
	
	static int n, m ;
	static int[] arr;
	static int[] pm;
	static int[] ch;
	
	
	public void DFS(int L) {
		if(L > m) return;
		if(L == m) {
			for(int x : pm) {
				System.out.print(x+" ");
			}
			System.out.println();
		}else {
			for(int i = 0; i<n; i++) {
				if(ch[i] ==0) {
					pm[L] = arr[i];
					ch[i] = 1;
					DFS(L+1);
					ch[i] = 0;
			}
	}
		}}
	//순열 구하기
	public static void main(String[] args) {
		
		exam61 T = new exam61();
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		m = scan.nextInt();
		
		arr = new int[n];
		pm = new int[m];
		ch = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		T.DFS(0);
		
		
	}
	}	









