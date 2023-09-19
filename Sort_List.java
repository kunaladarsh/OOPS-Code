/*
	Given the head of a linked list, return the 
	list after sorting it in ascending order.
	
	Example 1:
	Input: head = [4,2,1,3]
	Output: [1,2,3,4]
	
	Example 2:
	Input: head = [-1,5,3,4,0]
	Output: [-1,0,3,4,5]
	
	Example 3:
	Input: head = []
	Output: []
*/

package LinkedList;

public class Sort_List {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	   }

	class Solution {
	     public ListNode sortList(ListNode head) {
	        // Base Case
	        if(head == null || head.next == null){
	            return head;
	        }
	        
	        // Break linked list into 2 half, after Find mid 
	        ListNode mid = findmid(head);

	        ListNode left = head;
	        ListNode right = mid.next;
	        mid.next = null;

	        // recursive calls to sort both half
	        left = sortList(left);
	        right = sortList(right);

	        // merge both left and right half
	        ListNode result = merge(left, right);

	        return result;
	    }

	     ListNode findmid(ListNode head){
	        ListNode slow = head;
	        ListNode fast = head.next;

	        while(fast != null && fast.next != null){
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        return slow;
	    }

	     ListNode merge(ListNode left, ListNode right){
	        if(left == null){
	            return right;
	        }

	        if(right == null){
	            return left;
	        }

	        ListNode ans = new ListNode(-1);
	        ListNode temp = ans;

	        //merge 2 sorted Linked List
	        while(left != null && right != null){
	            if(left.val < right.val){
	                temp.next = left;
	                temp = left;
	                left = left.next;
	            }else{
	                temp.next = right;
	                temp = right;
	                right = right.next;
	            }}
	        
	        while(left != null){
	            temp.next = left;
	                temp = left;
	                left = left.next;
	        }
	        while(right != null){
	            temp.next = right;
	                temp = right;
	                right = right.next;
	        }
	        return ans.next;
	    }   
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
