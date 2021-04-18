package Practice_2;

import java.util.ArrayList;
import java.util.List;

public class Town {
    List<Family> families = new ArrayList<>();

    // Them thong tin ca nhan
    public void addFamily(Family family) {
        families.add(family);
    }


    // Hien thi thong tin ve gia dinh
    public void showFamilyInfo() {
        for (Family family : families) {
            family.showInfoMemberInFamily();

        }
    }

    // Hien thong tin gia dinh theo tuoi
    public void showInfoByAge(int age) {
        for (int i = 0; i < families.size(); i++) {
            for (int j = 0; j < families.get(i).getPerson().size(); j++) {
                int findAge = families.get(i).getPerson().get(j).getAge();
                if (findAge == age) {
                    families.get(i).showInfoMemberInFamily();
                }
            }
        }
    }
}

