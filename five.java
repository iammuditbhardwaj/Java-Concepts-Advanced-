// exception means error and handling means to handle the errors.
// here we handle the runtime errors like IOException  , classNotFoundException,
//  etc.

// what are the reasons of occuring the runtime exceptions ?

// the program written by user takes too much memory allocation.
// to work with wrong file paths.
// unstability of internet connection.
// incorrect code 
// incorrect user inputs.


class Parkhi {
    public static void main(String[] args) {
       int x= 1;
       int y= 2; 

       try {
        System.out.println(x/y);
       } catch (ArithmeticException e) {
       
}