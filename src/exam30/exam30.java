package exam30;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class exam30 {
	
	//크레인 인형뽑기(카카오)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[][] board = new int[n][n];
		for(int i = 0; i<n; i++	) {
			for(int j = 0; j<n; j++) {
				board[i][j] = scan.nextInt();
			}
		}
		
		int m = scan.nextInt();
		int [] moves = new int[m];
		for(int i = 0; i<m; i++) moves[i] = scan.nextInt();
		
		int answer =0;
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int pos : moves) {
			for(int i =0; i<board.length; i++ ) {
				if(board[i][pos-1]!=0) {
					int tmp =board[i][pos-1];
					board[i][pos-1] = 0;
					if(!stack.isEmpty() && tmp==stack.peek()) {
						answer+=2;
						stack.pop();
					}else {
						stack.push(tmp);
					}
					break;
				}
			}
		}
		
		
		System.out.println(answer);
		
		
		
		
		
		
		
	}
	}	









