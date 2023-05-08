package com.iface;

public class TestInterface {

	public static void main(String[] args) {

		City[] cList = new City[5];

		cList[0] = new City(1, "Indore", "MP");
		cList[1] = new City(2, "Bhopal", "MP");
		cList[2] = new City(3, "Mumbai", "MH");
		cList[3] = new City(4, "Delhi", "DH");
		cList[4] = new City(5, "Hedrabad", "AP");

		University[] uList = new University[5];

		uList[0] = new University(1, "Devi Ahilya Unviversity", "RNT Marg");
		uList[1] = new University(2, "Rajiv Gandhi Technical University",
				"MP Nagar");
		uList[2] = new University(3, "Barkatulla Unviversity", "Arera Colony");
		uList[3] = new University(4, "Jawahar Lal Nehru Unviversity",
				"Bapat Marg");
		uList[4] = new University(5, "Malipal University", "Manipal");

		// DropDownList dl = new City(1, "Indore", "MP");
		// City cc = (City) 

		Employee[] eList = new Employee[2];
		eList[0] = new Employee(1, "Lokesh", "Jha");
		eList[1] = new Employee(2, "Rajesh", "Jha");

		printList(cList);

		printList(uList);
		
		printList(eList);

	}

	public static void printList(DropDownList[] dList) {

		for (int i = 0; i < dList.length; i++) {

			System.out.print(" Key = " + dList[i].getKey());
			System.out.println(" Value = " + dList[i].getValue());

		}

	}

}
