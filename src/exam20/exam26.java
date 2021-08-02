package exam20;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class exam26 {
	
	//매출액의 종류
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];

		for(int i = 0 ; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i =0; i<k-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		int lt =0;
		for(int rt=k-1; rt<n; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			answer.add(map.size());
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt])==0) map.remove(arr[lt]);
			lt++;
		}
		                  
		System.out.println(answer);
			
			
	}
	}	









