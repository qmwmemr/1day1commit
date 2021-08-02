package exam10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exam17 {
	
	//봉우리
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		//String str = scan.next();
		int[][] arr = new int[n][n];

		for(int i = 0; i<n; i++) {
			for(int j =0; j<n; j++) {
				arr[i][j] = scan.nextInt();
			}
			
		}
		
		int answer = 0;
		
		int[] dx = {-1,0,1,0};
		int[] dy = {0,1,0,-1};
		
		
		for(int i =0 ; i<n; i++	) {
			for(int j =0; j<n; j++) {
				boolean flag = true;
				for(int k = 0; k<4; k++) {
					int nx = i +dx[k];
					int ny = j +dy[k];
					if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]) {
						flag = false;
						break;  
					}
				}
				if(flag) answer++;
			}
		}
		
		
		
		System.out.println(answer);
		
	}	
}
