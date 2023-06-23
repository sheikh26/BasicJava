package com.arif;

public class EncapsulationStudent {

	//properties // attributes
	//private no one can change directly
	private String studenName = null;
	private int studentRollNo = 0;
	
	//public methods setter and getters
	public String getStudenName() {
		return studenName;
	}
	public void setStudenName(String studenName) {
		this.studenName = studenName;
	}
	public int getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	
}
