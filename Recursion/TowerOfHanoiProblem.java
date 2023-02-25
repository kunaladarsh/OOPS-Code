/*     <<<Rule>>>
       1. Only one disk transferred in 1 step
       2. Smaller disks are always kept on top of larger disks
*/

package Complete_DSA;
public class TowerOfHanoiProblem {
	
	public static void towerOfHanoi(int n, String src, String helper, String dest) {
		if(n == 1) {
			System.out.println(" transfer disk " + n + " from " + src + " to " + dest);
			return;
		}
		
		
		towerOfHanoi(n-1, src, dest, helper);   
		System.out.println("transfer disk " + n + " from " + src+ " to " + dest);
		towerOfHanoi(n-1, helper, src, dest);
	}
	
		public static void main(String[] args) {
			int n=3;
			towerOfHanoi(n, "s", "H", "D");
	        
		}
}



























