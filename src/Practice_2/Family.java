package Practice_2;

import java.util.Scanner;

public class Family extends Person{
    private int amountOfPeople;
    private int homeNum;
    private Person person = new Person();

    public Family() {
    }

    public Family(int amountOfPeople, int homeNum, Person person) {
        this.amountOfPeople = amountOfPeople;
        this.homeNum = homeNum;
        this.person = person;
    }

    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(int amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

    public int getHomeNum() {
        return homeNum;
    }

    public void setHomeNum(int homeNum) {
        this.homeNum = homeNum;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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
        return  person.toString()+ "Số người : " + amountOfPeople +
                "Số nhà : " + homeNum;

    }
}
