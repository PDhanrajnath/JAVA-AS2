public class Main {

    public static void main(String args[])
    {
        // an array of objects using constructor
        // Declaring an array of Constructor class
        ConstructorClass[] arr;

        // Allocating memory for 2 objects
        // of type student
        arr = new ConstructorClass[2];

        // Initializing the first element
        // of the array
        arr[0] = new ConstructorClass("Apple");

        // Initializing the second element
        // of the array
        arr[1] = new ConstructorClass("Mango");

        // Displaying the name entered

        arr[0].display();
        arr[1].display();
    }
}