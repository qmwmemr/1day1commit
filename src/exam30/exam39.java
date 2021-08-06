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

		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = scan.nextInt();
		}

		for(int i = 1; i<n; i++) {
			int tmp = arr[i], j;
			for(j =i-1; j>=0;j--) {
				if(arr[j]>tmp) {
					arr[j+1] = arr[j];
					
				}else {
					break;
				}
			}
			arr[j+1] = tmp;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	}	









