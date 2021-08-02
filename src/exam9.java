

import java.util.ArrayList;
import java.util.Scanner;

public class exam9 {
	
	//큰수 출력하기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		//String str = scan.next();
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(arr[0]);
		
		for(int i =1; i<n; i++) {
			if(arr[i]>arr[i-1]) {
				answer.add(arr[i]);
			}
		}
		
		System.out.println(answer);
	}	
}
