// Multithreading is a process or functionality which we use to execute
//  two or more parts of program.

// how can you create a thread ? 
// java.lang.Thread => Thread 
// this upper written class overrides a method named run() method.
// create an object for our new class  start() method we can execute 
// or perform out thread process.


// here i am extending the thread class and writting few lines
//  in run method
class parkhi extends Thread { //superclass
    public void run() {
      System.out.println("parkhi is the child class of thread ");
        }
    }
}

public class India { // main class
    public static void main(String[] args) {
       parkhi p = new parkhi(); // here i am using only subclass.
       p.start();
    }
}

// this is called multi threading.



