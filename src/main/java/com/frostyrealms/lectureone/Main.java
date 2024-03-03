package com.frostyrealms.lectureone;

// JAVA BASICS LECTURE ONE
// Creating your first Java project.
//
// What will be covered:
// - Introduction to Java and OOP
// - Variables and Objects
// - DataTypes (Primitive and Non-Primitive)
// - Methods (Including Parameters and Returning)

// USEFUL RESOURCES
//
// Java Variables: https://www.w3schools.com/java/java_variables.asp
// Java Data Types: https://www.w3schools.com/java/java_data_types.asp
// Java Methods: https://www.tutorialspoint.com/java/java_methods.htm

// You can think of a class as a "page of a book"
// and a package is the "contents page". As you create
// more classes (or pages of the book) it helps form
// narrative of the book.
// Classes are where we put all related code.

// Anything you do in Java is essentially a "fancy
// combination of methods and variables" (as a way
// to put it in VERY simple terms). To put this in
// the context of a Minecraft plugin, everything is
// triggered by a method and those methods use
// variables to inform them of pieces of information
// that make the methods process properly.

public class Main {

    // This is a method. Methods will be gone over
    // in a later lecture.

    // Something to note: In a lot of programming
    // languages; including Java. They are
    // case-sensitive. For example, the below
    // method would not work if the "p" in
    // "public" was upper-case.

    public static void main(String[] args) {

        // Using a custom method to pass information
        // through the "method pipeline" explained
        // in the "methods" section of this lecture.
        usefulMethod("I'm passing this through a custom made method!");
        // You can even make multiple of these to pass
        // even more information through methods!
        usefulMethod("This is even more information! Wow!");

        // Here we are passing information over to the
        // method we created called "intMethod",
        // creating a variable named "result" as well
        // as giving "intMethod" the DataType parameter
        // the method requires of a String.
        int result = intMethod("This is an experiment with using different return types! This is a string but the method will also return with a number.");

        // Here we are using the above created "result"
        // variable and printing it to the console.
        // This is how we can use methods in more ways
        // than just giving information!
        System.out.println(result);

        // Pretty much everything in Java is just
        // methods and variables.
        //
        // A variable represents an Object. A
        // variable allows us to find whatever
        // we store in them in memory. We can
        // do a lot with this like change it,
        // set it and so on and so forth.
        //
        // Below are examples of variables.
        // Remember: A variable is way of
        // representing an Object.

        // Strings
        //
        // A string is just simply a collection
        // of letters.
        // The "String" portion below is defining
        // the DataType of the variable we are
        // defining, "sentence" is what we are
        // calling the DataType and or variable,
        // and we are making it equal to what we
        // want the string to be. In this case,
        // we are making a new DataType in the
        // form of a String and making the
        // String's value, "sentence" equal to
        // "This is a string!".

        String sentence = "This is a string!";

        // What can we do with this?
        //
        // As an example, we can print this
        // information to the Java console as
        // shown below.

        System.out.println(sentence);

        // Realistically, with this being a very
        // simple piece of code, we could make
        // this much smaller by simply not
        // creating a variable at all as seen
        // below.

        System.out.println("This is a string not using a variable!");

        // PRIMITIVE DATATYPES
        //
        // What is a DataType? A DataType is quite
        // literally what it says on the tin. A
        // DataType represents a type of data that
        // we can use. Below are different DataTypes.

        // int - An Integer simply stores a number.
        // Note: An Integer will always need to be a
        // whole number.
        // For example:
        int number = 5;

        // double - A Double is very similar to an integer
        // except it can store numbers in decimal form.
        // For example:
        double decimalNumber = 7.2;

        // boolean - A Boolean holds a value of true or false.
        // For example:
        boolean favoriteColorOrange = false;

        // char - A Char is a DataType that holds a single letter.
        // Note: Unlike the String DataType we do not use "" but
        // instead ''. Below are both examples of correct and
        // incorrect ways to use the Char DataType:
        // Incorrect usage: char letter = "J";
        // Correct usage: char letter = 'J';
        // Below is an example of using the Char DataType:
        char letter = 'J';

        // All of these examples are what we call the "built in
        // DataTypes in Java" also known as "Primitives". These
        // Primitive DataTypes are the very core and basics of
        // Java DataTypes. With this in mind the list of
        // Primitive DataTypes are Integers, Doubles,
        // Booleans and Chars.

        // NON-PRIMITIVE DATATYPES
        //
        // A Non-Primitive DataType is essentially a "wrapper"
        // over Primitive DataTypes. The difference between
        // the two is that a Non-Primitive DataType is using a
        // class and Primitive DataTypes are baked into Java.
        // This is important because where with Primitive
        // DataTypes we have a lot less methods available to
        // us as a "wrapper" like Non-Primitive DataTypes do.
        // For example, String is actually not a Primitive
        // DataType, it is a Non-Primitive DataType. A String
        // will ALWAYS be a Non-Primitive DataType.

        // String - A String is collection of letters
        // to build any sentence we choose. For example:
        String stringExample = "This is a string! A String is a Non-Primitive DataTypes.";

        // Integer in a Non-Primitive:
        Integer nonPrimitiveNumber = 3;

        // Double in a Non-Primitive:
        Double nonPrimitiveDouble = 2.2;

        // Boolean in a Non-Primitive
        // Note: Non-Primitive Booleans won't be used
        // all too often.
        Boolean nonPrimitiveBoolean = true;

        // char/Character in a Non-Primitive:
        Character nonPrimitiveCharacter = 'D';

        // In what cases do we use Primitive and
        // Non-Primitive DataTypes?
        //
        // An example of when using a Non-Primitive
        // DataType is useful would be an Integer.
        // For example, when using a Non-Primitive
        // Integer you have access to "parseInt()"
        // Where "parseInt()" takes a String value
        // when with Primitive DataTypes this would not
        // be an option. For almost all cases we
        // would be using Non-Primitive DataTypes,
        // however, there may be cases where it is
        // useful or necessary to use their
        // Primitive counterparts. The only
        // "real" exception to this would be Strings
        // as it is always going to be a Non-Primitive
        // DataType as explained before.

    }

    // VARIABLES


    // METHODS
    //
    // What is a method?
    // A method is essentially just a body of code.
    // An example of a method would be the code at
    // the very beginning of this class:

        /*

        public static void main(String[] args) {

        }

         */

    // Anything inside the "{}" (curly brackets)
    // is a body of code whe the method is run.
    // A simple way to think of a method is of
    // methods being a paragraph (the method) in
    // a page (the class) inside the book (package).
    // So with this analogy in mind, we will have
    // a load of methods (paragraphs) running in
    // our classes (pages). Here is another method:

    private void printMessage() {
        System.out.println("This is a String printed using a method!");

    }

    // In order for us to use this method in our initial
    // body of code we'd have to make this method "static".
    // To make a method "static" we would just add "static"
    // after the "private" in the method as shown below:

        /*

        private static void printMessage() {
            System.out.println("This is a String printed using a static method!");
        }

        */

    // After making the method "static" we could then
    // implement the method in our initial method by
    // adding "printMessage();" (what we had named our
    // method previously) and it would run what is
    // inside that method; in this example it would
    // print to the console "This is a String printed
    // using a static method!".

    // What makes so methods useful?
    //
    // An example of making a method useful would be
    // using methods to pass information on into other
    // methods. This can be seen in the blow method:

    // In this example we have created a method called
    // "usefulMethod" which has a Parameter of a String
    // DataType with a value we gave the String a
    // Parameter we named "message". Now, whenever we
    // call this method and give it a string it will
    // output the String we gave it (using the variable
    // "message") then output that String to the console.

    // An easy way to explain methods is that in this
    // example, the original method is the end of a
    // pipeline, the Parameter(s) "(String message)"
    // portion is the liquid that went through the pipe
    // and is inside the method (or "pipeline") is the
    // liquid that is being moved to the end of the
    // "pipeline" (our original method).

    // Simple method to run Parameters throughout
    // this entire class.
    private static void usefulMethod(String message) {
        System.out.println(message);
    }

    // Now this is a bit more tricky to wrap your head
    // around; just like methods can be used to pass
    // information it can also TAKE IN information.
    // When we are taking information that is what we
    // call a "Returning Method". In the above example
    // method we use the word "void", this is a
    // "Return Type" void is the "default setting".
    // The definition, not only in Java but generally,
    // means "nothing". With this being said, the above
    // method "useful method" doesn't need to return
    // anything since it is using the Void Return Type.
    // Void is used for when you don't care whether the
    // method returns anything, however, what if you did
    // want the method to return something? This is how
    // we would go about doing this.

    private static int intMethod(String intMessageString) {
        System.out.println(intMessageString);
        return 9;
    }

    // Woohoo! This is the end of the first lecture!
    // We're gonna keep it going! :)
}