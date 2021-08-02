package exam20;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exam23 {
	
	//최대 길이 연속부분수열(복합적 문제)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];

		for(int i = 0 ; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int answer = 0, cnt=0, lt = 0;
		
		for(int rt = 0; rt<n; rt++) {
			if(arr[rt] == 0) cnt++;
			while(cnt>k) {
				if(arr[lt] == 0) cnt--;
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
		
		}
		
		
		System.out.println(answer);
			
			
			
	}
	}	









