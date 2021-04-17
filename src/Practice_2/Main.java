package Practice_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Town town = new Town();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            menu();
            choice = sc.nextInt();
            switch (choice){
                case 1 : {
                    Family family =  new Family();
                    family.inputFamilyInfo();
                    town.addFamily(family);
                    break;
                }
                case 2 : {
                    town.showInfoPerson();
                    break;
                }
                case 3: {
                    System.out.println("Nhập tuổi muốn kiểm tra thông tin");
                    int age = sc.nextInt();
                    town.showInfoByAge(age);
                    break;
                }
            }
        } while (choice != 0);
    }

    private static void menu() {
        System.out.println("Nhập lựa chọn của bạn");
        System.out.println("1. Nhập thông tin cá nhân.");
        System.out.println("2. Hiển thị thông tin cá nhân.");
        System.out.println("3. Hiển thị thông tin gia đình bằng cách nhập tuổi.");
        System.out.println("0. Thoát.");
        System.out.println("---------------");
    }
}
