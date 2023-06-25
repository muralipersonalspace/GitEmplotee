package org.emp;

public class EmployeeOne {
	
	private void add() {
		System.out.println("add");

	}

	private void sub() {
		System.out.println("sub");
	}
		private void mul() {
			System.out.println("mul");
	}
	
	public static void main(String[] args) {
		 EmployeeOne E = new EmployeeOne();
		 E.add();
		 E.sub();
	}

}
