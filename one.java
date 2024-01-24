class Students {
    public void allGoodStudents() {
        System.out.println("All my students are good students");
    }
}
class Student1 extends Students {
    @Override
    public void allGoodStudents() {
        System.out.println("Student 1 is a good student");
    }
}

//this is called method overriding.