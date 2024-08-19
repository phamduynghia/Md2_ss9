package practice3_ss9;

public class Main {
    public static void main(String[] args) {

//        khởi tạo các đối tượng học sinh v giáo viên
        Student student1 = new Student("nguyễn trọng nam",22);
        Student student2 = new Student("pham quynh anh",19);
        Student student3 = new Student("nguyen như nhất",20);

        Teacher teacher1=new Teacher("to ngoc lam",33);
        Teacher teacher2=new Teacher("Ngo manh phuc",35);

//        hiển thị thông tin bằng phương thức displayInfo()
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

        teacher1.displayInfo();
        teacher2.displayInfo();
    }
}
