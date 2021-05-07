package test;

public class Test081 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee e = new Employee();
//		e.setSalary(100);
//		e.setName("a");
//		Person p = e;
//		System.out.println(p.getName());
		
//		Person p = new Person();
//		Employee e = (Employee) p;	
		
//		Employee e = new Employee();
//		Person p = e; // upcasting
//		Employee ee = (Employee) p; // downcasting
//		Manager m = (Manager) ee;
		
//		Person p2 = new Manager();
//		Employee e2 = (Employee) p2;
	
		Employee e = new Employee();
		Person p = new Person();
		System.out.println(p instanceof Person);
		System.out.println(p instanceof Employee);
		System.out.println(e instanceof Person);
		System.out.println(e instanceof Employee);
//		Manager e3 = (Manager) p3;
	}

}
