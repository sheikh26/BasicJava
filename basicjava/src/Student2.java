
//StaticVariable example
/* If we want to access class members without creating an instance of the class, 
 we need to declare the class members static.
 Static Variables
In Java, when we create objects of a class, then every object will have its own copy of 
all the variables of the class. For example,*/
public class Student2 {
	
	    int rollno;
	    String name;
	    static String college ="GGGI"; //Static Variable gets memory once

	    /*Constructor of Student class*/
	    Student2(int r,String n)
	    {
	        rollno = r;
	        name = n;
	    }
	    
	    /*Method For Displaying Student Details*/
	    void display()
	    {
	        System.out.println(rollno+" "+name+" "+college); // print the value of roll no, name and college
	    }

	    public static void main(String args[])
	    {
	        Student2 s1 = new Student2(101,"Gagan");
	        Student2 s2 = new Student2(102,"paraman");
	        s1.display();  // call the display function using the s1 object
	        s2.display();   // call the display function using the s2 object
	    }


}
