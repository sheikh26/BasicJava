package com.inheritance;

public class TestPer {

	public static void main(String[] args) {

		/*
		 * Person p = new Person();
		 * 
		 * p.setFirstName("Amit");
		 * 
		 * System.out.println(p.getFirstName());
		 * 
		 * System.out.println("________________");
		 */

		/*
		 * Person q = new Person("Vadik","Vyas","SouhTukogunj");
		 * 
		 * System.out.println("%%" + q.getFirstName());
		 */
/*
		Employee e = new Employee("anil", "ambani", "cmd");

		System.out.println(e.getFirstName());
		
		e.changeAddress();
*/
		Employee e = new Employee();
		e.setDob("7/7/7");
		
		System.out.println(e.getDob());
	
	
	}

}
