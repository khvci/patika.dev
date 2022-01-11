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

    public void printEmployee() {
        System.out.println("--------------------");
        System.out.println("Name\t\t: " + this.employeeName);
        System.out.println("Work Hours\t: " + this.workHours);
        System.out.println("Contract\t: " + this.contractYear);
        System.out.println("New Salary\t: " + (int)(this.salary));
    }

    public void newYear() {
        this.bonus();
        this.raiseSalary();
        this.tax();
        this.printEmployee();
    }


}