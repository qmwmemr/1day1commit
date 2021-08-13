package exam40;


import java.io.CharConversionException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class exam44 {
	
	public static int count(int[] arr, int capacity) {
		int cnt =1, sum =0;
		for(int x : arr) {
			if(sum+x>capacity) {
				cnt++;
				sum=x;
			}else {
				sum+=x;
			}
		}
		return cnt;
	}
	
	
	//뮤직비디오(결정알고리즘)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int answer = 0;
		
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(arr, mid)<=m) {
				answer = mid;
				rt = mid-1;
			}else {
				lt = mid+1;
			}
		}
		
		
		System.out.println(answer);
		
	}
	}	









