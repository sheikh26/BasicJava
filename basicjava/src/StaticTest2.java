/*Static Methods
Static methods are also called class methods. It is because a static method 
belongs to the class rather than the object of a class.

And we can invoke static methods directly using the class name. For example,*/
public class StaticTest2 {

	// non-static method
    int multiply(int a, int b){
        return a * b;
    }

    // static method
    static int add(int a, int b){
        return a + b;
    }




   public static void main( String[] args ) {

        // create an instance of the StaticTest class
        StaticTest2 st = new StaticTest2();

        // call the nonstatic method
        System.out.println(" 2 * 2 = " + st.multiply(2,2));

        // call the static method
        System.out.println(" 2 + 3 = " + StaticTest2.add(2,3));
   }
}
