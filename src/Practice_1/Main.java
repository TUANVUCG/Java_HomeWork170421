package Practice_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            menu();
            choice = sc.nextInt();
            switch (choice){
                case 1:{
                    BorrowCard borrowCard = new BorrowCard();
                    borrowCard.inputBorrowCardInfo();
                    manager.addBorrowCard(borrowCard);
                    break;
                }
                case 2 : {
                    manager.showBorrowInfo();
                    break;
                }
                case 3: {
                    System.out.println("Nhập mã sinh viên cần tìm : ");
                    int id = sc.nextInt();
                    manager.findStudentById(id);
                    break;
                }
                case 4: {
                    manager.findBookNeedPay();
                    break;
                }
                case 0: {
                    break;
                }
            }
        }while (choice != 0);
    }

    private static void menu() {
        System.out.println("-----------------");
        System.out.println("Nhập lựa chọn của bạn");
        System.out.println("1. Nhập thông tin sinh viên");
        System.out.println("2. Hiển thị danh sách sinh viên.");
        System.out.println("3. Tìm sinh viên theo mã sinh viên.");
        System.out.println("4. Tìm tên sách cần trả vào ngày cuối tháng.");
        System.out.println("0. Thoát");
        System.out.println("-----------------");
    }
}
