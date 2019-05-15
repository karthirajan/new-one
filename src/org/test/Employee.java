package org.test;

public class Employee {

	public  static Employee emp;
	private Employee() {
		
	}
	
	public static Employee getIns() {
		if(emp==null) {
			emp=new Employee();
		}
		System.out.println(emp);
		return emp;
	}
	
	public void empId() {
		System.out.println("emp id is 12345678");
	}
	
	
	public void empName() {
		System.out.println("emp name is nisha");
	}
	public static void main(String[] args) {
		Employee e=getIns();
		e.empId();
		e.empName();
	}
}
