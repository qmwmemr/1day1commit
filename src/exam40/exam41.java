package exam40;


import java.io.CharConversionException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class exam41 {
	
	//장난꾸러기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
	
		String answer = "U";
		Arrays.sort(arr);
		
		for(int i = 0 ; i<arr.length-2; i++) {
			if(arr[i] == arr[i+1]) answer="D";
		}
		
		System.out.println(answer);
		
	}
	}	









