public class non_primitive{
    public static void non_primitive(){
//Non-Primitive - String, Arrays, Classes and interfaces etc.

//A String in Java is a non-primitive data type, 
//because it refers to an object. The String object has methods 
//that are used to perform certain operations on strings. 
//Unlike primitive data types, strings are not a 'simple' data type. 
//They are classes provided by Java for handling text data.
String myString = "Hello, World!";
System.out.println(myString);

//An array in Java is a non-primitive data type that can hold multiple values of the same type. 
//The elements in an array are created when an array is created and destroyed when the array is destroyed.
// Declare an array
int[] myArray = new int[5];

// Initialize elements
myArray[0] = 10;
myArray[1] = 20;
myArray[2] = 30;
myArray[3] = 40;
myArray[4] = 50;

// Access elements
System.out.println(myArray[0]); // Outputs: 10
System.out.println(myArray[1]); // Outputs: 20
System.out.println(myArray[2]); // Outputs: 30
System.out.println(myArray[3]); // Outputs: 40
System.out.println(myArray[4]); // Outputs: 50

//In Java, a class is a blueprint for creating objects. 
//An object is an instance of a class, and it can contain state (fields) and behavior (methods).

    }
}

// Define a class
class MyClass {
    // Field (state)
    int x = 5;

    // Method (behavior)
    void display() {
        System.out.println("The value of x is: " + x);
    }
}

 class ClassName {
    public static void main(String[] args) {
        // Create an object of MyClass
        MyClass myObj = new MyClass();

        // Access the field
        System.out.println(myObj.x);  // Outputs: 5

        // Call the method
        myObj.display();  // Outputs: The value of x is: 5
    }
}



