package Practice_2;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String job;

    public Person() {
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public int getAge() {
        return age;
    }


    public Person inputPersonInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên : ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi : ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập nghề nghiệp : ");
        job = sc.nextLine();
        Person person = new Person(name,age,job);
        return person;
    }

    @Override
    public String toString() {
        return  "Tên : " + name + "    " +
                "Tuổi : " + age + "     "+
                "Nghề nghiệp : " + job+"    ";
    }
}
