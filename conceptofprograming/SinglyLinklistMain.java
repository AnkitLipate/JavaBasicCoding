package conceptofprograming;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

class singlyList {
	static class Node {
		private int data;
		private Node next;

		public Node() {
			this.data = 0;
			this.next = null;
		}

		public Node(int val) {
			this.data = val;
			this.next = null;
		}
	}

	private Node head;

	public singlyList() {
		this.head = null;
	}

	void display() {
		System.out.println("List: ");
		Node trav = head;
		while(trav !=null) {
			System.out.println(trav.data);
			trav = trav.next;
			}
		System.out.println("");;
	}
	void addFirst(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
		
	}
	void addLast(int val) {
		Node newNode = new Node(val);
		
		if(head==null)
			head = newNode;
		else {
			Node trav = head;
			while(trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
		}

	}
	void addAtPos(int val, int pos) {
		if(head == null || pos<=1)
			addFirst(val);
		else {
			Node newNode = new Node(val);
			Node trav = head;
			for(int i=1; i<pos-1; i++)
				if(trav.next==null)
					break;
				trav = trav.next;
			newNode.next = trav.next;
			trav.next = newNode;
		}
	}
	void delFirst() {
		if(head==null)
			throw new RuntimeException("List is empty");
		head = head.next;
	}
	void delLast() {
		if(head==null)
			throw new RuntimeException("List is empty.");
		if(head.next == null)
			head = null;
		else {
			Node temp=null, trav = head;
			while(trav.next !=null) {
				temp = trav;
				trav = trav.next;
			}
			temp.next = null;
			
		}
	}
	void delAtPos(int val, int pos) {
		if(pos == 1)
			delFirst();
		if(head==null || pos<1)
			throw new RuntimeException("List is empty or Invalid position");
		Node temp=null, trav=head;
		for(int i=1; i<pos; i++) {
			if(trav ==null)
				throw new RuntimeException("invalid position");
			temp = trav;
			trav = trav.next;
		}
		temp.next = trav.next;
		
	}
	void delAll() {
		head = null;
	}
	
}

public class SinglyLinklistMain {

	public static void main(String[] args) {
		int choice, val, pos;

		singlyList list = new singlyList();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(
					"\n\n0.Exit \n1.Display \n2.Add First \n3.Add Last \n4.Add At Pos \n5.Del First \n"
					+ "6.Del Last \n7.delAtPos \n8.delAll");
			choice = sc.nextInt();
			switch (choice) {
			case 1:// display
				list.display();
				break;

			case 2:// addFirst
				System.out.println("Enter an Element");
				val = sc.nextInt();
				list.addFirst(val);
				break;
			case 3:// addLast
				System.out.println("Enter an Element");
				val = sc.nextInt();
				list.addLast(val);
				break;
			case 4:// addAtPos
				System.out.println("Enter an Element");
				val = sc.nextInt();
				System.out.println("Enter the pos");
				pos = sc.nextInt();
				list.addAtPos(val, pos);
				break;
			case 5:// delFirst
				list.delFirst();
				break;
			case 6:// delLast
				list.delLast();
				break;
			case 7:// delAtPos
				System.out.println("Enter an element");
				val = sc.nextInt();
				System.out.println("Enter the position");
				pos = sc.nextInt();
				list.delAtPos(val, pos);
				break;
			case 8:// delAll
				list.delAll();
				break;
			}
		} while (choice != 0);
		sc.close();
	}

}
