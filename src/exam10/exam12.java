package exam10;


import java.util.ArrayList;
import java.util.Scanner;

public class exam12 {
	
	//점수계산
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		//String str = scan.next();
		int[] ch = new int[n];

		int answer = 0;
		
		for(int i =2; i<=n; i++	) {
			if(ch[i] == 0) {
				answer++;
				for(int j =i; j<=n; j=j+i) {
					ch[j] =1;
				}
			}
		}
		System.out.println(answer);
	}	
}
