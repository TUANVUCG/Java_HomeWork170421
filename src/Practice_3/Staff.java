package Practice_3;

import java.util.Scanner;

public class Staff extends Officers{
    private String work;

    public Staff() {
    }

    public Staff(String work) {
        this.work = work;
    }

    public Staff(String name, String birthOfDate, String gender, String address, String work) {
        super(name, birthOfDate, gender, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void inputStaffInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập công việc của nhân viên : ");
        work = sc.nextLine();
    }


    @Override
    public String toString() {
        return "Staff{" + super.toString()+
                "work='" + work + '\'' +
                '}';
    }
}
