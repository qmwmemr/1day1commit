package exam50;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam56 {
	
	static int n, m ;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	
	public void BFS(int v) {
		Queue<Integer> Q = new LinkedList<Integer>();
		ch[v] = 1;
		dis[v] = 0;
		Q.offer(v);
		while(!Q.isEmpty()) {
			int cv = Q.poll();
			for(int nv : graph.get(cv)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					Q.offer(nv);
					dis[nv] = dis[cv] +1;
				}
			}
		}
	}
	
	//그래프 최단거리(BFS)
	public static void main(String[] args) {
		
		exam56 T = new exam56();
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		m = scan.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i =0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		dis = new int[n+1];
		for(int i =0; i<m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			graph.get(a).add(b);
		}
		T.BFS(1);
		for(int i =2 ; i<=n; i++) {
			System.out.println(i + " : "+ dis[i]);
		}
	
	}
	}	









