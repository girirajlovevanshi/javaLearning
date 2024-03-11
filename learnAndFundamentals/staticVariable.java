public class staticVariable {
    // These are static variables
    static int g = 10; // static variable
    static int h = 20; // static variable
    static int i = g; // static variable
    

    public static void main(String[] args) {
        // Access static variables directly from the class
        System.out.println("Value of static variable g: " + staticVariable.g);
        System.out.println("Value of static variable h: " + staticVariable.h);
        System.out.println("Value of static variable i: " + staticVariable.i);
        second();
    }

    public static void second() {
        System.out.println("Value of static variable g: " + staticVariable.g);

        
    }

}
