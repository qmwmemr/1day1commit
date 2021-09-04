package exam50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam59 {
	static int answer = Integer.MAX_VALUE;
	static int n, m , sum =0;
	static Integer[] arr;
	
	
	public void DFS(int L, int sum) {
		if(sum > m) return;
		if(L>=answer) return;
		if(sum == m) {
			answer = Math.min(answer, L);
		}else {
			for(int i=0; i<n; i++) {
				DFS(L+1, sum+ arr[i]);
			}
		}
	}
	
	//동전교환
	public static void main(String[] args) {
		
		exam59 T = new exam59();
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		arr = new Integer[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		//내림차순으로 정렬하는법(int형 배열이아닌 Integer형 배열해야됨)
		Arrays.sort(arr,Collections.reverseOrder());
		
		
		m = scan.nextInt();
		
		T.DFS(0,0);
		
		System.out.println(answer);
	}
	}	









