package Practice_1;

import java.util.Scanner;

public class BorrowCard {
    private int borrowNum;
    private int borrowDate;
    private int payDate;
    private String bookCode;
    private Student student = new Student();


    public BorrowCard() {
    }

    public BorrowCard(int borrowNum, int borrowDate, int payDate, String bookCode, Student student) {
        this.borrowNum = borrowNum;
        this.borrowDate = borrowDate;
        this.payDate = payDate;
        this.bookCode = bookCode;
        this.student = student;
    }

    public int getBorrowNum() {
        return borrowNum;
    }

    public void setBorrowNum(int borrowNum) {
        this.borrowNum = borrowNum;
    }

    public int getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(int borrowDate) {
        this.borrowDate = borrowDate;
    }

    public int getPayDate() {
        return payDate;
    }

    public void setPayDate(int payDate) {
        this.payDate = payDate;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void inputBorrowCardInfo(){
        student.inputStudentInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phiếu mượn : ");
        borrowNum = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập ngày mượn : ");
        borrowDate = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập hạn trả : ");
        payDate = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập số hiệu sách : ");
        bookCode = sc.nextLine();
    }

    public void showBorrowInfo() {
        System.out.println( student.showStudentInfo()+ " Số phiếu mượn : " + borrowNum +
                "Ngày mượn : " + borrowDate +  "     " +
                "Hạn trả : " + payDate + "     " +
                "Số hiệu sách : " + bookCode);
    }
}
