package JavaCode;

	class MyEmployee{
		private String name;
		private int salary;
	
	public String getname() {
		return name;
	}	
	public String setname(String n){
		name = n;
		return n;	
	}
	
	public int getSalary() {
		return salary;	
	}
	public int setSalary(int sal) {
		sal = salary;
		return sal;
		}
	}
	public class AccessModifiers {
	
	public static void main(String[] args) {
		MyEmployee harry = new MyEmployee();
		harry.setname("Harry kumar singh");
		System.out.println(harry.getname());
	}

	}
	


