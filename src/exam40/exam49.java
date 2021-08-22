package exam40;


import java.io.CharConversionException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class exam49 {
	
	static int n;
	static int[] ch;
	
	public void DFS(int L) {

		if(L == n+1) {
			String tmp = "";
			for(int i =1; i<=n; i++) {
				if(ch[i] == 1) tmp +=(i+" ");
			}
			if(tmp.length()>0) System.out.println(tmp);
		}else {
			ch[L] = 1;
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
		}
		
	}
	
	//부분집합 구하기(DFS)
	public static void main(String[] args) {
		
		exam49 t = new exam49();
		n = 3;
		ch = new int[n+1];
		t.DFS(1);
	
	
	}
	}	









