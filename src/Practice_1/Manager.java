package Practice_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    List<BorrowCard> borrowCardList = new ArrayList<>();
    Student student = new Student();
    Scanner sc = new Scanner(System.in);
    // Nhap thong tin sinh vien va The muon
    public void addBorrowCard(BorrowCard borrowCard) {
        borrowCardList.add(borrowCard);
    }

    // Hien thi thong tin
    public void showBorrowInfo() {
        for (BorrowCard borrowCard : borrowCardList) {
            borrowCard.showBorrowInfo();
        }
    }

    // Tim sinh vien theo ma sinh vien
    public void findStudentById(int id) {
        for (BorrowCard borrowCard : borrowCardList) {
            if (borrowCard.getStudent().getId()==id) {
                borrowCard.showBorrowInfo();
            }
        }
    }

    // Tim ten sach can tra vao ngay cuoi thang
    public void findBookNeedPay(){
        for(BorrowCard borrowCard : borrowCardList){
            if(borrowCard.getPayDate()==31){
                System.out.println(borrowCard.getBookCode());
            }
        }
    }
}
