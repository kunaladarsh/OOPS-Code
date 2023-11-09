/*
	Given the head of a linked list, remove the nth 
	node from the end of the list and return its head.
	
	Example 1:
	Input: head = [1,2,3,4,5], n = 2
	Output: [1,2,3,5]
	
	Example 2:
	
	Input: head = [1], n = 1
	Output: []
	Example 3:
	
	Input: head = [1,2], n = 1
	Output: [1]
 */

package LinkedList;

public class Remove_Nth_Node_From_End_of_List {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	   }

	
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        ListNode temp = head;
	        int count = 0;
	        while(temp != null){
	           temp = temp.next;
	           count++;
	        }
	        if(count==1){
	            return null;
	        }
	        if(count==n){
	        head=head.next;
	        return head;
	        }
	        ListNode temp1 = head;
	        for(int i=1; i<=count-n-1; i++){
	         temp1 = temp1.next;
	        }
	        temp1.next = temp1.next.next;

	        return head;
	    }

	public static void main(String[] args) {
		

	}

}
