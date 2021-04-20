package Practice_3;

import java.util.Scanner;

public class Worker extends Officers{
    private String level;

    public Worker() {
    }

    public Worker(String level) {
        this.level = level;
    }

    public Worker(String name, String birthOfDate, String gender, String address, String level) {
        super(name, birthOfDate, gender, address);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void inputWorkerInfo(){
        Scanner sc = new Scanner(System.in);
        super.inputOfficerInfo();
        System.out.print("Nhập bậc công nhân : ");
        level = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Worker{" +super.toString()+
                "level='" + level + '\'' +
                '}';
    }
}
