package exam20;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exam21 {
	
	//최대매출
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i<n; i++) {
				arr[i] = scan.nextInt();
		}
	
		int answer = 0, sum=0, lt = 0;
		
		for(int rt = 0; rt<n; rt++) {
			sum+=arr[rt];
			if(sum ==m) answer++;
			while(sum>=m) {
				sum-=arr[lt++];
				if(sum==m) answer++;
			}
		}
		
		
		System.out.println(answer);
			
			
			
	}
	}	









