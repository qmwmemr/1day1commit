package exam50;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam51 {
	
	
	int answer = 0;
	int[] dis = {1, -1, 5};
	int[] ch;
	Queue<Integer> Q = new LinkedList<Integer>();
	
	public int BFS(int s , int e) {
		ch = new int[10001];
		ch[s] = 1;
		Q.offer(s);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			System.out.println(L + " : ");
			for(int i = 0; i<len; i++) {
				int x = Q.poll();
				
				for(int j=0; j<3; j++) {
					int nx = x+ dis[j];
					if(nx==e) return L+1;
					if(nx>=1 && nx<=10000 && ch[nx]==0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
				System.out.println(Q);
			}
			L++;
		}
		return 0;
	}
	
	//송아지 찾기1(BFS)
	public static void main(String[] args) {
		
		exam51 t = new exam51();
		
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int e = scan.nextInt();
		System.out.println(t.BFS(s, e));
	
	}
	}	









