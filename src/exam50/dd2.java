package exam50;

import java.util.ArrayList;
import java.util.Scanner;

public class dd2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int answer = 1;
		int max = arr[n-1];
		for(int i = n-2; i>=0; i--) {
			if(arr[i]>max) {
				answer++;
				max = arr[i];
			}
		}
		
		System.out.println(answer);

	}
}
