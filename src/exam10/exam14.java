package exam10;


import java.util.ArrayList;
import java.util.Scanner;

public class exam14 {
	
	//점수계산
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		//String str = scan.next();
		int[] arr = new int[n];

		for(int i = 0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int answer = 0;
		int cnt = 0;
		
		for(int i =0; i<n; i++) {
			if(arr[i] == 1) {
				cnt++;
				answer+= cnt;
			}else {
				cnt =0;
			}
		}
		
		
		System.out.println(answer);
	}	
}
