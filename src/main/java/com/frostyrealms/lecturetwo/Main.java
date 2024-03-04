package com.frostyrealms.lecturetwo;

// JAVA BASICS LECTURE TWO
// Understanding further functionality.
//
// What will be covered:
// - If Statements and Operators
// - Null
// - Exceptions
// - Classes, Instances and Constructors

public class Main {

   public static void main(String[] args) {

       // Creating an integer for demonstration.
       int number = 5;

       // IF STATEMENTS AND OPERATORS
       //
       // In Java there are what we call decision-making
       // statements; one of the most common one of these
       // statements would be an "if" statement. Below is
       // going to be an example of an if statement:

       // Note: Whatever is inside the parentheses is the
       // condition which MUST be true in order for the
       // code inside the curley brackets to run.
       // At the end of the curley brackets you can add
       // what we call an "else" statement. This is what
       // is run when the conditions of the if statement
       // are not met.

       // If statement example number 1
       if (number > 3) {
           // This would return true because 5 is greater
           // than 3.
       } else {
           // This code would not run because the if
           // statement already returned true, however,
           // if it were to return false, then this block
           // of code would run.
       }

       // If statement example number 2
       if (number < 3) {
           // This would return false because 5 is not
           // less than 3.
       } else {
           // This code would run because the if statement
           // returned false.
       }

       // You can also combine both if and else statements.
       // For example:
       if (number > 3) {
           // In this case this code would run because 5
           // is greater than 3.
       } else if (number < 2) {
           // This code would not run at all because the
           // initial if statement returned true.
       }

       // Note: If else statements can be infinite. Also,
       // technically, a boolean is a form of "if" statement.
       // For example:

       boolean testBoolean = true;

       if (testBoolean == true) {
           // Since the boolean variable that we have created
           // is defined as true, this code would run. Also
           // note: here we are using "==" to compare the two
           //
       }

       // Seeing that our variable that we are using in this
       // if statement is a boolean we can actually cut out
       // the "=="s and any type of comparison at all. Example:
       if (testBoolean) {
           // This code would run since our "testBoolean"
           // variable is set to true.
       }

       // TYPES OF OPERATORS
       //
       // ">" GREATER THAN
       // "<" LESS THAN
       // ">=" GREATER THAN OR EQUAL TO
       // "<=" LESS THAN OR EQUAL TO
       // "==" EQUAL TO
       // "!=" NOT EQUAL TO
       // "&&" AND
       // "||" OR

   }
}
