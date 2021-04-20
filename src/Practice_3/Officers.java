package Practice_3;

import java.util.Scanner;

public class Officers {
    private String name;
    private   String birthOfDate;
    private String gender;
    private String address;

    public Officers() {
    }

    public Officers(String name, String birthOfDate, String gender, String address) {
        this.name = name;
        this.birthOfDate = birthOfDate;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(String birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputOfficerInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên : ");
        name = sc.nextLine();
        System.out.print("Nhập ngày sinh : ");
        birthOfDate = sc.nextLine();
        System.out.print("Nhập giới tính : ");
        gender = sc.nextLine();
        System.out.print("Nhập địa chỉ : ");
        address = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Officers{" +
                "name='" + name + '\'' +
                ", birthOfDate='" + birthOfDate + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
