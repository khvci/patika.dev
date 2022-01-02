public class WageCalculator {

    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 2000, 45, 1985);
        Employee emp2 = new Employee("Chris", 2000, 45, 2019);
    }
}
    public class Employee {
        String employeeName;
        float salary;
        byte workHours;
        short contractYear;
        short currentYear;

        public Employee(String employeeName, float salary, byte workHours, short contractYear) {
            this.employeeName = employeeName;
            this.salary = salary;
            this.workHours = workHours;
            this.contractYear = contractYear;
            this.currentYear = 2022;
        }

        public float bonus() {
            if (this.workHours > 40) {
                salary += (this.workHours - 40) * 30;
            }
        }

        public float raiseSalary() {
            if (this.currentYear - this.contractYear < 10) {
                this.salary *= 1.05;
            } else if (this.currentYear - this.contractYear < 20) {
                this.salary *= 1.1;
            } else {
                this.salary *= 1.15;
            }

            bonus();
            tax();
            toString();
        }

        public float tax() {
            if (this.salary > 1000) {
                this.salary *= 0.97;
            }
        }

        public void toString() {
            System.out.println("Name:\t");
            System.out.println("Current Salary:\t");
            System.out.println("Work Hours:.\t");
            System.out.println("Contract Year\t");
            System.out.println("New Salary:\t");
        }


    }


