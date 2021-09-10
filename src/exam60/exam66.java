package exam60;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam66 {
	
		static int[] dx = {-1,-1,0,1,1,1,0,-1};
		static int[] dy = {0,1,1,1,0,-1,-1,-1};
		static int answer =0;
		static int n;
	
	public void DFS(int x, int y, int[][] board) {
		for(int i =0; i<8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny] == 1) {
				board[nx][ny] = 0;
				DFS(nx, ny, board);
			}
		}
		
	}
	
	
	//피자배달거리(DFS) ㅋㅋ
	public static void main(String[] args) {
		
		exam66 T = new exam66();
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		int[][] board = new int[n][n];
		
		for(int i =0; i<n; i++) {
			for(int j =0; j<n; j++) {
				board[i][j] = scan.nextInt();
			}
		}
		
		for(int i =0; i<n; i++) {
			for(int j =0; j<n; j++) {
				if(board[i][j] == 1) {
					answer++;
					board[i][j] =0;
					T.DFS(i, j, board);
				}
			}
		}
		
		
		System.out.println(answer);
		
		
	}
	}	









