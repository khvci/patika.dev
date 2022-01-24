public class WageCalculator {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 2000, 45, 1985);
        Employee emp2 = new Employee("Chris", 2000, 45, 2019);

        emp1.newYear();
        emp2.newYear();
    }
}

/*
Output:
--------------------
Name		: John
Work Hours	: 45
Contract	: 1985
New Salary	: 2398
--------------------
Name		: Chris
Work Hours	: 45
Contract	: 2019
New Salary	: 2189

 */




