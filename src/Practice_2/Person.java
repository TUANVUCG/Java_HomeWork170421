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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void inputPersonInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên : ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi : ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập nghề nghiệp : ");
        job = sc.nextLine();
    }

    @Override
    public String toString() {
        return  "Tên : " + name + "    " +
                "Tuổi : " + age + "     "+
                "Nghề nghiệp : " + job+"    ";
    }
}
