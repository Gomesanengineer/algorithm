package com.icr.test;

/**
 * @author tringapps
 *
 * @param <T>
 */
public class ReverseLinkedList<T> {

	private LNode<T> head;

	public void add(T element) {

		LNode<T> nd = new LNode<T>();
		nd.setValue(element);
		System.out.println("Adding: "+element);
		LNode<T> tmp = head;

		while(true){
			if(tmp == null){
				//since there is only one element, both head and 
				//tail points to the same object.

				head = nd;
				break;
			} else if(tmp.getNextRef() == null){
				tmp.setNextRef(nd);
				break;
			} else {
				tmp = tmp.getNextRef();
			}
		}
	}

	public void traverse() {
		LNode<T> tmp = head;
		while (true) {
			if (tmp == null) {
				break;
			}
			System.out.print(tmp.getValue() + "\t");
			tmp = tmp.getNextRef();
		}
	}

	public void reverse() {
		LNode<T> current = head;
		LNode<T> next = null;
		LNode<T> prev = null;
		
		while(current!=null) {
			next = current.getNextRef();
			current.setNextRef(prev);
			
			prev = current;
			current = next;
		
		}
		
		head = prev;
		
	}
	
	
	
//	public void reverse() {
//
//		System.out.println("\nreversing the linked list\n");
//		LNode<T> prev = null;
//		LNode<T> current = head;
//		LNode<T> next = null;
//		
//		while (current != null) {
//			System.out.println("cur : "+current+" Nxt : "+next +":: current.getNextRef : "+current.getNextRef()+" :: prev : "+prev);
//			next = current.getNextRef();
//			current.setNextRef(prev);
//			prev = current;
//			current = next;
//		
//		}
		/*
		
		head = prev;
	}*/

	public static void main(String[] arg) {

		ReverseLinkedList<Integer> sl = new ReverseLinkedList<Integer>();
		sl.add(3);
		sl.add(32);
		sl.add(54);
		sl.add(89);
		
		sl.add(8);
		sl.add(9);
		sl.add(19);
		sl.add(29);
		sl.add(91);
		sl.add(12);
		
		System.out.println();
		sl.traverse();
		System.out.println();

		sl.reverse();
		sl.traverse();

	}

}

class LNode<T> implements Comparable<T> {

	private T value;
	private LNode<T> nextRef;
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public void setNextRef(LNode<T> nxtRe) {
		this.nextRef = nxtRe;
				
	}
	public LNode<T> getNextRef() {
		return nextRef;
	}
	
	
	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String toString() {
		return value+" ";
	}

}
