package exam20;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class exam24 {
	
	//학급 회장
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String str = scan.next();
		
		char answer = ' ';
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
		
		for(char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		System.out.println(map.containsKey('g'));
		System.out.println(map.size());
		System.out.println(map.remove('C'));
		System.out.println(map);
		System.out.println(map.size());
		
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			//System.out.println(x+ " " + map.get(key));
			if(map.get(key) >max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		System.out.println(answer);
		
	}
	}	









