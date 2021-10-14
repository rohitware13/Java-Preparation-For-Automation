import java.util.*;

public class LinkedList {

	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	
	
	
	Node head = null;
	Node tail = null;
	
	public void addNode(int data) {	
		Node new_node = new Node(data);
		
		if(head==null) {
			head = new_node;
			tail=new_node;
		}
		else {
			tail.next=new_node;
			tail = new_node;
		}
	
		
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addNode(1);
		list.addNode(2);
		list.displayList(list);
		
	}
	
	public  void displayList(LinkedList list) {
		
		Node current = head;
		
		if(head==null) {
			System.out.println("Empty");
		}
		else {
			while(current!=null) {
				System.out.println(current.data);
				current = current.next;
			}
		}
	}
}
