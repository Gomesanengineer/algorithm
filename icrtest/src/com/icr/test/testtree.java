package com.icr.test;

public class testtree {

	public static void main(String[] arg) {
		Tree t = new Tree();
		Node n = t.createNode(10);
		
		t.add(n, 5);
		t.add(n, 2);
		t.add(n, 3);
		t.add(n, 1);
		t.add(n, 6);
		t.add(n, 15);
		t.add(n, 13);
		t.add(n, 12);
		
		t.display(n);
		
	}
	
}

class Node {
	Node left;
	Node right;
	int value;	
}


class Tree {
	
	public Node add(Node a, int value) {
		
		if(a == null) {
			a = createNode(value);
		}
		
		if(value < a.value ) {
			a.left = add(a.left, value) ;
		} else if(value > a.value){
			a.right = add(a.right, value);
		}
		
		return a;
	}
	
	public Node createNode(int value) {
		Node n = new Node();
		n.value = value;
		n.left = n.right = null;
		return n;
	}
	
	public void display(Node a) {
		if(a!=null) {
			display(a.left);
			System.out.println(a.value);
			display(a.right);
		}
	}
}