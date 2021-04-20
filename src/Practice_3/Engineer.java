package Practice_3;

import java.util.Scanner;

public class Engineer extends Officers{
    private String majors;

    public Engineer() {
    }

    public Engineer(String majors) {
        this.majors = majors;
    }

    public Engineer(String name, String birthOfDate, String gender, String address, String majors) {
        super(name, birthOfDate, gender, address);
        this.majors = majors;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public void inputEngineerInfo(){
        Scanner sc = new Scanner(System.in);
        super.inputOfficerInfo();
        System.out.print("Nhập chuyên ngành : ");
        majors = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Engineer{" + super.toString()+
                "majors='" + majors + '\'' +
                '}';
    }
}
