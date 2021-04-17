package Practice_2;

import java.util.ArrayList;
import java.util.List;

public class Town {
    List<Family> families = new ArrayList<>();

    // Them thong tin ca nhan
    public void addFamily(Family family) {
        families.add(family);
    }

    // Hien thi thong tin ve moi ca nhan
    public void showInfoPerson() {
        for (Family family : families) {
            System.out.println(family.toString());
            ;
        }
    }

    // Tim so nha theo tuoi 80
    public int findHomeNum() {
        int homeNumber = 0;
        for (Family family : families) {
            if (family.getPerson().getAge() == 80) {
                homeNumber = family.getHomeNum();
            }
            else {
                System.out.println("Không có cụ nào 80 tuổi.");
            }
        }
        return homeNumber;
    }

    // Hien thi thong tin ve cac ho co nguoi 80 tuoi
    public void showInfo80() {
        for (Family family : families) {
            if (family.getPerson().getAge() == 80) {
                int homeNumber = findHomeNum();// tim so nha
                for (Family family1 : families) {
                    if (family1.getHomeNum() == homeNumber) {
                        System.out.println(family1.toString()); // hien thi thong tin cua nhung nguoi cung so nha voi nguoi 80 tuoi
                    }
                }
            }
        }
    }
}
