import java.util.Calendar;

public class Employee {
    String employeeName;
    double salary;
    int workHours;
    int contractYear;
    int currentYear;

    public Employee(String employeeName, double salary, int workHours, int contractYear) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.workHours = workHours;
        this.contractYear = contractYear;
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public void bonus() {
        if (this.workHours > 40) {
            this.salary += (this.workHours - 40) * 30;
        }
    }

    public void raiseSalary() {
        if (this.currentYear - this.contractYear < 10) {
            this.salary *= 1.05;
        } else if (this.currentYear - this.contractYear < 20) {
            this.salary *= 1.1;
        } else {
            this.salary *= 1.15;
        }
    }

    public void tax() {
        if (this.salary > 1000) {
            this.salary *= 0.97;
        }
    }

    public String toString() {
        System.out.println("Name:\t");
        System.out.println("Current Salary:\t");
        System.out.println("Work Hours:.\t");
        System.out.println("Contract Year\t");
        System.out.println("New Salary:\t");
        return null;
    }


}