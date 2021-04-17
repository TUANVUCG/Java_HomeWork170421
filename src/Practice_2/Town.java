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

    // Tim so nha theo tuoi
    public int findHomeNum(int age) {
        int homeNumber = 0;
        boolean k = false;
        for (Family family : families) {
            if (family.getPerson().getAge() == age) {
                homeNumber = family.getHomeNum();
                k = true;
            }
        }if(!k){
            System.out.println("Không có cụ nào 80 tuổi !");
        }
        return homeNumber;
    }

    // Hien thi thong tin ve cac ho co nguoi 80 tuoi
    public void showInfoByAge(int age) {
        boolean k = false;
        int homeNumber = findHomeNum(age);
        for (Family family1 : families) {
            if (family1.getHomeNum() == homeNumber) {
                System.out.println(family1.toString()); // hien thi thong tin cua nhung nguoi cung so nha voi nguoi 80 tuoi
            }
        }
    }
}

