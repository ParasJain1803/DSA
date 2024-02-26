public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Marvin";
        s1.roll= 1422;

        Student s2 = new Student("Paras", 1);
        s2.password = "asd";

        Student s3 = new Student(s1);
        s3.password = "asdf";
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // non parameterized constructor
    Student() {                     
        System.out.println("Construcetor is called");
    }

    // parameterized constructor
    Student(String name, int roll) { 
        marks = new int[3];
        this.name = name;
        this.roll = roll;
    }

    // constructor overloading
    Student(int roll) {          
        marks = new int[3];
        this.roll = roll;
    }

    /*  shallow copy constructor
    Student(Student s1) { 
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }*/

    // shallow deep constructor
    Student(Student s1) { 
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i=0; i<this.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
