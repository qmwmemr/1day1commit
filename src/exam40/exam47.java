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

public class exam47 {
	static int[] fibo;
	
	public int DFS(int n) {
		if(fibo[n]>0) return fibo[n];
		if(n == 1) return fibo[n] = 1;
		else if(n ==2) return fibo[n] = 1;
		else{
			return fibo[n] =  DFS(n-2) + DFS(n-1);
		}
	}
	
	
	//피보나치 재귀(메모이제이션)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		exam47 t = new exam47();
		
		fibo = new int[n+1];
		t.DFS(n);
		
		for(int i = 1; i<=n; i++	) {
			System.out.print(fibo[i]+" ");
		}
	}
	}	









