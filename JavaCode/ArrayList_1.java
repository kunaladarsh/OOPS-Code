package Complete_DSA;

public class ArrayList {
	Node head;

	class Node{
		String data;
		Node next;
		
		Node (String data){
			this.data = data;
			this.next = null;
		}
	}

	
	// add - first, Last
	public void addFirst(String data) {
		Node newNode = new Node(data);
		// Node head = null;
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(String data) {
		Node newNode = new Node(data);
		// Node head = null;
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
	}
	
	public void printList() {
		  //  Node head = null; 
		   
			if(head == null) {
			   System.out.println("List is empty");		
		}
			
			Node currNode = head;
			while(currNode.next != null) {
				System.out.println(currNode.data + " ->");
				currNode = currNode.next;
			}
			
			System.out.println("Null");
	}
	
    public static int findSum(int A[],int N) 
    {
    
    int min =A[0];
    int max =A[0];
    
    
    
    for(int i = 0; i<N; i++){
        if(max>A[i]){
            max=A[i];
        }
        
        if(min<A[i]){
            min = A[i];
        }
    }
    
    int sum = min + max;
    System.out.println(sum);
	return sum;
    }
    
    
    static int subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
    	int m =0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
               if(arr[i]+ arr[j] == s){
                   System.out.println(i+1);
                   System.out.println(j+1);
                   m = i+1;
                   
               }
            }
        }
		return m;
    }


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		
		
	}

}
