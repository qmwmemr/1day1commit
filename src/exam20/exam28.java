package exam20;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class exam28 {
	
	//K번째 큰 수
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];

		for(int i = 0 ; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int answer = -1;
		
		TreeSet<Integer> Tset = new TreeSet<Integer>(Collections.reverseOrder());
		
		for(int i =0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int l= j+1; l<n; l++) {
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt =0;
		for(int x : Tset) {
			cnt++;
			if(cnt ==k) answer = x;
			System.out.println(x);
			
		}
		
		System.out.println(answer);
			
			
	}
	}	









