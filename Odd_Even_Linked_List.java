/*
Given the head of a singly linked list, group all the nodes with odd \
ndices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain
 as it was in the input.
 

Example 1:


Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
Example 2:


Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]
*/

package LinkedList;

public class Odd_Even_Linked_List {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	   }
	
	 public ListNode oddEvenList(ListNode head) {
		    ListNode temp = head;
		    ListNode d = new ListNode();
		    ListNode d1 = new ListNode(1);
		    ListNode a = d;
		    ListNode b = d1;
		    int count = 0;
		    while(temp != null){
		        count++;
		        if((count) % 2 == 0){
		            ListNode aval = new ListNode(temp.val);
		            a.next = aval;
		            a = a.next;
		        }
		        else{
		            ListNode aval1 = new ListNode(temp.val);
		            b.next = aval1;
		            b = b.next;
		        }
		        temp = temp.next;
		    }

		    d = d.next;
		    d1 = d1.next;
		    ListNode t = d1;
		    if(t == null){
		        return null;
		    }
		    while(t.next != null){
		         t = t.next;
		    }
		    t.next = d;
		    return d1;
		    }

	public static void main(String[] args) {
		

	}

}
