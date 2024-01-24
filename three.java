// dynamic binding = its all about in the binding where my compiler 
// can not perform functions which are going to be call.
// Dynamic binding is all about overriding the method not by using static 


public class Main {
    public static class Chandigarh { //super class  (1)
        void print() 
        { 
            System.out.println("Chandigarh is very bad place.");
        }
    }
    
    public static class elante extends Chandigarh {
        @Override void print()
        {
            System.out.println("Elante is very good place.");
        }

        public static void main(String[] args) {
            Chandigarh x = new Chandigarh();
            Chandigarh y = new elante();
        }

        x.print();
        y.print();
