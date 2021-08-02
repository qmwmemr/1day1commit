package exam10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exam18 {
	
	//임시반장 구하기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		//String str = scan.next();
		int[][] arr = new int[n+1][6];

		for(int i = 1; i<=n; i++) {
			for(int j =1; j<=5; j++) {
				arr[i][j] = scan.nextInt();
			}
			
		}
		
		int answer = 0;
		int max = Integer.MIN_VALUE;
		
		
		for(int i =1 ; i<=n; i++) {
			int cnt = 0;
			for(int j =1; j<=n; j++) {
				for(int k = 1; k<=5; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
					}
				
				}
			if(cnt>max) {
				max = cnt;
				answer = i;
			}
			}
		System.out.println(answer);
		}
		
		
		
		
	}	
