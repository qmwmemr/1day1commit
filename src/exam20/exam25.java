package exam20;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class exam25 {
	
	//아나그램
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
		
		String answer = "Yes";
		
		for(char x : a.toCharArray()) {
			map.put(x,map.getOrDefault(x, 0)+1);
		}
		
		for(char x : b.toCharArray()) {
			if(!map.containsKey(x) || map.get(x)==0) {
				answer = "NO";
			}
			map.put(x, map.get(x)-1);
		}
		
		System.out.println(answer);
		
		
	}
	}	









