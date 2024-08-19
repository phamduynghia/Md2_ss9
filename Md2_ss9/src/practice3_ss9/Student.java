package practice3_ss9;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + this.getName()+
                "-Age : "+this.getAge()+"}");
    }
}
