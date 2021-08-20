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

public class exam46 {
	
	public int DFS(int n) {
		if(n == 1) return 1;
		else {
			return n*DFS(-1);
		}
	}
	
	
	//재귀함수(팩토리얼)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		exam46 t = new exam46();
		
		System.out.println(t.DFS(n));
	}
	}	









