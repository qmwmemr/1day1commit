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

public class exam36 {
	
	//선택정렬
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = scan.nextInt();
		}

		
		
		
		for(int i =0; i<n-1; i++	) {
			int idx = i;
			for(int j=i+1; j<n; j++	) {
				if(arr[j] < arr[idx]) {
					idx = j;
				}
				int tmp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = tmp;
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	}	









