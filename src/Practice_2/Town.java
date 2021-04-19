package Practice_2;

import java.util.ArrayList;
import java.util.List;

public class Town {
    List<Family> familyList = new ArrayList<>();

    // Them thong tin ca nhan
    public void addFamily(Family family) {
        familyList.add(family);
    }


    // Hien thi thong tin ve gia dinh
    public void showFamilyInfo() {
        for (Family family : familyList) {
            family.showInfoMemberInFamily();

        }
    }

    // Hien thong tin gia dinh theo tuoi
    public void showInfoByAge(int age) {
        for (int i = 0; i < familyList.size(); i++) {
            for (int j = 0; j < familyList.get(i).getPerson().size(); j++) {
                int findAge = familyList.get(i).getPerson().get(j).getAge();
                if (findAge == age) {
                    familyList.get(i).showInfoMemberInFamily();
                }
            }
        }
    }
}

