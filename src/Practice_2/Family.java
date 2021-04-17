package Practice_2;

import java.util.Scanner;

public class Family extends Person{
    private int amountOfPeople;
    private int homeNum;
    private Person person = new Person();

    public Family() {
    }



    public int getHomeNum() {
        return homeNum;
    }

    public Person getPerson() {
        return person;
    }

    public void inputFamilyInfo(){
        person.inputPersonInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số người trong gia đình : ");
        amountOfPeople = sc.nextInt();
        System.out.print("Nhập số nhà: ");
        homeNum = sc.nextInt();
        System.out.println("----------------");
    }

    @Override
    public String toString() {
        return  person.toString()+ "Số người : " + amountOfPeople +"     "+
                "Số nhà : " + homeNum;

    }
}
