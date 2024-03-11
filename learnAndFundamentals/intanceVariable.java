public class intanceVariable {
    // These are instance variables
    int a = 10; // instance variable
    int b = 20; // instance variable
    

    public static void main(String[] args) {

        // Create an object of Main to access instance variables
        intanceVariable main = new intanceVariable();
        System.out.println("Value of instance variable a: " + main.a);
        System.out.println("Value of instance variable b: " + main.b);

    }

}
