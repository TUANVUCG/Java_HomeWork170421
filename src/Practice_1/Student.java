package Practice_1;

import java.util.Scanner;

public class Student {
    private String studentName;
    private int id;
    private String birthOfDate;
    private String className;

    public Student() {
    }

    public Student(String studentName, int id, String birthOfDate, String className) {
        this.studentName = studentName;
        this.id = id;
        this.birthOfDate = birthOfDate;
        this.className = className;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(String birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void inputStudentInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên.");
        System.out.print("Nhập tên sinh viên : ");
        studentName = sc.nextLine();
        System.out.print("Nhập mã sinh viên : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập ngày sinh : ");
        birthOfDate = sc.nextLine();
        System.out.print("Nhập tên lớp : ");
        className = sc.nextLine();
    }

    public String showStudentInfo() {
        return  "Tên sinh viên : " + studentName + "     " +
                " Mã sinh viên : " + id + "     " +
                " Ngày sinh : " + birthOfDate + "     " +
                " Tên lớp : " + className + "     "
                ;
    }
}
