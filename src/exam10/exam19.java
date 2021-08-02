package exam10;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exam19 {
	
	//멘토링
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		//String str = scan.next();
		int[] a = new int[n];

		for(int i = 0; i<n; i++) {
				a[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		//String str = scan.next();
		int[] b = new int[m];

		for(int i = 0; i<m; i++) {
				b[i] = scan.nextInt();
		}
		
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		
		int p1 = 0, p2 = 0;
		
		while(p1<n && p2<m) {
			if(a[p1] < b[p2]) {
				answer.add(a[p1++]);
			}else {
				answer.add(b[p2++]);
			}
		}
		while(p1<n) answer.add(a[p1++]);
		while(p2<m) answer.add(b[p2++]);
		
		
		System.out.println(answer);
		
		}
	}	
