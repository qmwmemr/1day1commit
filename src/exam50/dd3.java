package exam50;

import java.util.Arrays;
import java.util.Scanner;

public class dd3 {

	static int[][] arr;
	static int n;
	static int m;
	static int x;
	static int cnt2;
	static int cnt3;
	
	
	public int min(int x) {
		
		for(int i = 0; i<m; i++) {
			if(Arrays.asList(arr[i][0]).contains(x)) {
				cnt2++;
				min(arr[i][1]);
			}else {
				cnt3++;
			}
			
		}
		if(cnt3 == m) return 8;
		else if (cnt3 == m*m) return 1;
		else return cnt2;
	}
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		m = scan.nextInt();
		x = scan.nextInt();
		arr = new int[m][2];

		for(int i =0; i<m; i++) {
			for(int j = 0; j<2; j++) {
				arr[i][j] = scan.nextInt();
				if(arr[i][j] >n || arr[i][j]<=0) break;
			}
		}
		
		int cnt = 1;
		//최대순위
		for(int i =0; i<m; i++) {
			if(Arrays.asList(arr[i][1]).contains(x)) {
				cnt++;
			}
		}
		
		//최저순위
		dd3 a = new dd3();
		
		System.out.println(cnt + " " + a.min(x));
		
		
	}
}
