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
		
		Arrays.sort(arr);
		
		int lt =0, rt=n-1;
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(arr[mid] == m) {
				answer = mid+1;
				break;
			}
			if(arr[mid] > m){
					rt = mid-1;
			}else {
				lt = mid+1;
			
			}
		}
		
		
		
		System.out.println(answer);
	}
	}	









