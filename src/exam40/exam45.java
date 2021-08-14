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

public class exam45 {
	
	public static int count(int[] arr, int capacity) {
		int cnt =1, ep =arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] - ep>= capacity) {
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}
	
	
	//마구간 정하기(결정알고리즘)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int answer = 0;
		Arrays.sort(arr);
		
		
		int lt = 1;
		int rt = arr[n-1];
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(arr, mid)>=m) {
				answer = mid;
				lt=mid+1;
			}else {
				rt = mid-1;
			}
		}
		
		
		System.out.println(answer);
		
	}
	}	









