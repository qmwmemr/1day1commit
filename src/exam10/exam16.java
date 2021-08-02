package exam10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exam16 {
	
	//등수구하기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		//String str = scan.next();
		int[] arr = new int[n];

		for(int i = 0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int cnt = 1;
		
		int[] answer = new int[n];
		
		for(int i =0; i<n; i++) {
			for(int j=0;j<n; j++) {
				if(arr[i]<arr[j]) {
					cnt++;
				}
			}
			answer[i] = cnt;
			cnt = 1;
		}
		
		
		System.out.println(Arrays.toString(answer));
	}	
}
