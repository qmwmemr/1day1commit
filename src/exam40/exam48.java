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

class Node{	
	int data;
	Node lt, rt;
	public Node(int val) {
		data= val;
		lt = rt = null;
	}
}

public class exam48 {
	
	Node root ;
	public void DFS(Node root) {
		if(root == null) return;
		else {
			DFS(root.lt);
			System.out.print(root.data+ " ");
			DFS(root.rt);
		}
	}
	
	//이진트리순회(DFS : Depth-First Search)
	public static void main(String[] args) {
		
		exam48 tree = new exam48();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}
	}	









