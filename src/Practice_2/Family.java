package Practice_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Family  {
    private int amountOfPeople;
    private int homeNum;
    private final List<Person> personList = new ArrayList<>();

    public Family() {
    }

    public int getHomeNum() {
        return homeNum;
    }

    public List<Person> getPerson() {
        return personList;
    }

    public void inputFamilyInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số người trong gia đình : ");
        amountOfPeople = sc.nextInt();
        System.out.print("Nhập số nhà: ");
        homeNum = sc.nextInt();
        System.out.println("Nhập thông tin thành viên : ");
        for (int i = 0; i < amountOfPeople; i++) {
            System.out.println("Thành viên thứ "+ (i+1)+ " :");
            Person person = new Person().inputPersonInfo();
            personList.add(person);
        }
        System.out.println("----------------");
    }

    public void showInfoMemberInFamily(){
        for(Person person : personList){
            System.out.println(person.toString()+ "Số nhà : "+ homeNum+" Số thành viên : "+amountOfPeople);
        }
    }
}

