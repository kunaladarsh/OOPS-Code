package JavaCode;

class cylinder{
	private int radius;
	private int height;

   public int setradius() {
	return radius;	
  
   }
   public int getradius(int n) {
	 radius = n;
	 return n; 
   }
   
   public int setheight() {
		return height;	
	   }
	   public int getheight(int h) {
		 height = h;
		 return h; 
	   } 
	   
	  public  int surface(){
		return  (int) ((height + radius)* (2* 3.142 * radius));
		   
	   }
	  
	  public int volume(){
		return  (int) (3.142 * radius * radius * height);   
		}
}

public class  Cylinder_Problem {

	public static void main(String[] args) {
	cylinder cy = new cylinder();
	cy.getradius(9);
	cy.getheight(12);
	System.out.println(cy.setradius());
	System.out.println(cy.setheight());
	System.out.println(cy.surface() +" meter^2");
	System.out.println(cy.volume() +" meter^3");

 
		
		
	}

}
