package exam50;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam57 {
	
	static String answer = "No";
	static int n, total =0 ;
	boolean flag = false;
	
	public void DFS(int L,int sum, int[] arr) {
		if(flag) return;
		if(sum>total/2) return;
		if(L == n) {
			if((total-sum) == sum) {
				answer="YES";
				flag = true;
			}
		}else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
	}
	
	//합이 같은 부분 집합
	public static void main(String[] args) {
		
		exam57 T = new exam57();
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		int [] arr = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = scan.nextInt();
			total+=arr[i];
		}
		
		T.DFS(0, 0, arr);
		System.out.println(answer);
		
		
	}
	}	









