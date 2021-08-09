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

public class exam42 {
	
	static class Point implements Comparable<Point>{
		public int x,y;
		
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		
		@Override
		public int compareTo(Point o) {
			if(this.x == o.x) return this.y-o.y;
			else return this.x-o.x;
		}
	}
	
	//좌표정렬
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		ArrayList<Point> arr = new ArrayList<exam42.Point>();
		for(int i = 0; i<n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			arr.add(new Point(x, y));
		}
		
		Collections.sort(arr);
		for(Point x : arr) {
			System.out.println(x.x+" "+x.y);
		}
	}
	}	









