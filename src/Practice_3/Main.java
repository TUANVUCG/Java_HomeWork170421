package Practice_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lựa chọn của bạn : ");
        int choice =-1;
        do{
            menu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1 : {
                    manager.inputInfo();
                    break;
                }
                case 2 : {
                    manager.showOfficeInfo();
                }
                case 3: {
                    findByName(manager, sc);
                    break;
                }
            }

        }while(choice !=0 );
    }

    private static void menu() {
        System.out.println("1. Nhập thông tin mới cho cán bộ");
        System.out.println("2. Hiển thị thông tin tất cả cán bộ");
        System.out.println("3. Tìm kiếm theo họ tên");
        System.out.println("0 . Thoát.");
    }

    private static void findByName(Manager manager, Scanner sc) {
        System.out.println("Nhập tên cán bộ : ");
        String name = sc.nextLine();
        manager.showInfoByName(name);
    }
}
