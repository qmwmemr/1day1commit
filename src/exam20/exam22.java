package exam20;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exam22 {
	
	//연속된 자연수의 합
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n/2 +1];

		for(int i = 0 ; i<n/2+1; i++) {
			arr[i] = i+1;
		}
		
		int answer = 0, sum=0, lt = 0;
		
		for(int rt = 0; rt<n/2+1; rt++) {
			sum+=arr[rt];
			if(sum == n) answer++;
			while(sum>=n) {
				sum-=arr[lt++];
				if(sum == n) answer++;
			}
		}
		
		
		System.out.println(answer);
			
			
			
	}
	}	









