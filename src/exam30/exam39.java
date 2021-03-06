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

public class exam39 {
	
	//LRU(캐시, 카카오 변형)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int s = scan.nextInt();
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int[] cache = new int[s];
		
		for(int x : arr) {
			int pos  = -1;
			for(int i = 0; i<s; i++) if (x==cache[i]) pos=i;
			if(pos == -1) {
				for(int i = s-1; i>=1; i--) {
					cache[i] = cache[i-1];
				}
				cache[0] = x;
			}else {
				for(int i = pos; i>=1; i--) {
					cache[i] = cache[i-1];
				}
				cache[0] = x;
			}
			
		}
		
		
		System.out.println(Arrays.toString(cache));
		
	}
	}	









