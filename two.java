// static binding program = a kind of binding in which programmer is easy to reduce compile time, 
// is known as static binding. in other words, i can say that  bindings of different functions like private
//  or static comes under static binding.

class Punjab { //main class
    public static class Chandigarh{ //super class(parent class)
        static void print() 
        {
            System.out.println("Chandigarh is very beautiful city");
        }
    }
}

//2nd class (subclass)   
public static class sukhnaLake extends Chandigarh {
    static void print()
    {
    System.out.println("Sukhna Lake is very beautiful lake");
    }

public static void main(String[] args) {
    Chandigar x = new Chandigarh();
    sukhnaLake y = new sukhnaLake();

    x.print();
    y.print();
}







    



