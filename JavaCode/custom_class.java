package JavaCode;

class Employee{
	int id;
	String name;
	public void printDetails() {
		System.out.println("My id is "+ id);
		System.out.println("and my name is "+ name);
	}
}
	
public class custom_class {	
	public static void main(String[] args) {
          System.out.println("This is our custom class");
          Employee office = new Employee(); //instantiating new office object 
          Employee homes = new Employee();
          
          // setting properties OR Attributes
          office.id = 12;
          office.name = "Adarsh Kunal";
          
          // printing the Attributes
//          System.out.println(office.id);
//          System.out.println(office.name);
          office.printDetails();
          
          
          
           homes.id = 102;
           homes.name = "KunSINGH_House";
//           System.out.println(homes.id);
//           System.out.println(homes.name);
           
           homes.printDetails();

          
          
	}

}
