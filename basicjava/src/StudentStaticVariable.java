
//StaticVariable example
/* If we want to access class members without creating an instance of the class, 
 we need to declare the class members static.
 Static Variables
In Java, when we create objects of a class, then every object will have its own copy of 
all the variables of the class. For example,*/
public class StudentStaticVariable {
	
	    private int rollno;
	    private String name;
	    private static String university ="DAVV"; //Static Variable gets memory once

	    /*Constructor of Student class*/
	    StudentStaticVariable(int r,String n)
	    {
	        rollno = r;
	        name = n;
	    }
	    
	    /*Method For Displaying Student Details*/
	    public void display()
	    {
	        System.out.println(rollno+" "+name+" "+university); // print the value of roll no, name and college
	    }

	    public static void main(String args[])
	    {
	        StudentStaticVariable s1 = new StudentStaticVariable(101,"Arif");
	        StudentStaticVariable s2 = new StudentStaticVariable(102,"Michel");
	        StudentStaticVariable s3 = new StudentStaticVariable(103,"Rizwan");

	        s1.display();  // call the display function using the s1 object
	        s2.display();   // call the display function using the s2 object
	        s3.display();   // call the display function using the s2 object
	    }


}
