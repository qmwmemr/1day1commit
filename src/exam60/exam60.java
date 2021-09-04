package exam60;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam60 {
	
	static int n, m ;
	static int[] pm;
	
	
	public void DFS(int L) {
		if(L == m) {
			for(int x : pm) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		else {
			for(int i = 1; i<=n ; i++) {
				pm[L] = i;
				DFS(L+1);
			}
		}
		
	}
	
	//중복순열
	public static void main(String[] args) {
		
		exam60 T = new exam60();
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		m = scan.nextInt();
		
		pm = new int[m];
		
		
		T.DFS(0);
		
		
	}
	}	









