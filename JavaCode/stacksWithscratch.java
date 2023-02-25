package DSA_Pratices;

public class stacksWithscratch {
	
	// push --> 0(1)
	// pop --> 0(1)
	// peek --> 0(1)
	
	static class node{
		int data;
		node next;
		public node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	
	static class stack{
		public static node head;
		public static boolean isEmpty() {
			return head == null;
		}
		
		public static void push(int data) {
			node newNode  = new node(data);
			if(isEmpty()) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
			
		}
	}
	
	public static void main(String[] args) {
		
		
	}
}
