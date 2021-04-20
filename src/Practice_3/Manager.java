package Practice_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    Scanner sc = new Scanner(System.in);
    List<Officers> officersList = new ArrayList<>();

    // Nhap thong tin cho can bo
    public void inputInfo() {
        System.out.println("Bạn muốn nhập thông tin cán bộ nào (1. công nhân, 2.kỹ sư, 3.nhân viên)");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Nhập thông tin công nhân :");
                Worker worker = new Worker();
                worker.inputWorkerInfo();
                officersList.add(worker);
            }
            break;
            case 2: {
                System.out.println("Nhập thông tin kỹ sư : ");
                Engineer engineer = new Engineer();
                engineer.inputEngineerInfo();
                officersList.add(engineer);
                break;
            }
            case 3: {
                System.out.println("Nhập thông tin nhân viên : ");
                Staff staff = new Staff();
                staff.inputStaffInfo();
                officersList.add(staff);
            }

        }
    }

    // Hien thi thong tin can bo
    public void showOfficeInfo() {
        for (Officers officers : officersList) {
            System.out.println(officers.toString());
        }
    }

    // Tim kiem theo ho ten
    public void showInfoByName(String name) {
        for(Officers officers : officersList){
            if(officers.getName().equals(name)){
                System.out.println(officers.toString());
            }
        }
    }
}
