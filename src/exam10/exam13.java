package exam10;


import java.util.ArrayList;
import java.util.Scanner;

public class exam13 {
	
	public boolean isPrime(int num) {
		if(num==1) return false;
		for(int i =2 ; i<num; i++) {
			if(num%i==0) return false;
		}
		return true;
	}
	
	
	//뒤집은 소수
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		//String str = scan.next();
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		ArrayList<Integer> answer = new ArrayList<Integer>();

		for(int i =0; i<n; i++	) {
			int tmp = arr[i];
			int res =0;
			while(tmp>0) {
				int t = tmp%10;
				res = res * 10 + t;
				tmp = tmp/10;
			}
		}
		
		
	}	
}
