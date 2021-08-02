package exam10;


import java.util.ArrayList;
import java.util.Scanner;

public class exam11 {
	
	//가위바위보
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		//String str = scan.next();
		int[] a = new int[n];

		int n1 = 1;
		int n2 = 1;
		int n3 = 0;
		
		for(int i =2; i<n; i++) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
		}
		
		System.out.println(n + "번째 값은 "+ n3);
		
	}	
}
