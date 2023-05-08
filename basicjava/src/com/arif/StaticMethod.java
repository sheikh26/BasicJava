package com.arif;
/*Static Methods
Static methods are also called class methods. It is because a static method 
belongs to the class rather than the object of a class.

And we can invoke static methods directly using the class name. For example,*/
public class StaticMethod {

	// non-static method
	static int multiply(int a, int b){
        return a * b;
    }

    // static method
    static int add(int a, int b){
        return a + b;
    }




   public static void main( String[] args ) {

        // create an instance of the StaticTest class
        StaticMethod st = new StaticMethod();

        // call the nonstatic method
        System.out.println(" 2 * 2 = " + st.multiply(2,2));

        // call the static method
        System.out.println(" 2 + 3 = " + StaticMethod.add(2,3));
        
        System.out.println(" 2 + 3 = " + StaticMethod.multiply(2,2));
   }
}
