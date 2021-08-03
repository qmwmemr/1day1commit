package exam20;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class exam27 {
	
	//모든 아나그램 찾기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		String b = scan.next();
		
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		
		int answer = 0;
		int ln = b.length();
		
		for(char x : b.toCharArray()) {
			bm.put(x, bm.getOrDefault(x, 0)+1);
		}
		
		for(int i = 0 ; i<ln-1; i++) {
			am.put(a.charAt(i),	am.getOrDefault(a.charAt(i), 0)+1);
		}
		
		int lt = 0;
		
		for(int i = ln-1; i< a.length(); i++) {
			am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
			if(am.equals(bm)) answer++;
			am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
			if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
			lt++;
		}
		
		System.out.println(answer);
		
	}
	}	









