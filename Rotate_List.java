/*
	Given the head of a linked list, rotate the
	 list to the right by k places.
	
	Example 1:
	Input: head = [1,2,3,4,5], k = 2
	Output: [4,5,1,2,3]
	
	Example 2:	
	Input: head = [0,1,2], k = 4
	Output: [2,0,1]
*/


package LinkedList;

public class Rotate_List {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	   }
	
	public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        if(head == null || head.next == null || k==0){
            return head;
        }
        int size = 1;
        while(temp.next != null){
            size++;
            temp = temp.next;
        }

        ListNode tail = temp;
        int ActualR = 0;
        if(k==size){
            return head;
        }

        if(k>size){
            int a = k%size;
            if(a==0){
                return head;
            }
            ActualR = size - a;
        }else{
            ActualR = size - k;
        }
        ListNode first = head;

        temp = head;
        for(int i=1; i<ActualR; i++){
            temp = temp.next;
        }
        ListNode finalHead = temp.next;
        temp.next = null;
        tail.next = first;
        return finalHead;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
