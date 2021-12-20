import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1,num2;
        byte selection;

        System.out.print("First number: ");
        num1 = input.nextDouble();

        System.out.print("Second  number: ");
        num2 = input.nextDouble();

        System.out.println("1- Add (+)\n2- Subtract (-)\n3- Multiply (*)\n4- Divide(/)");
        System.out.print("Please select what you want to do: ");
        selection = input.nextByte();

        switch (selection) {
            case 1:
                System.out.println("Result is: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result is: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result is: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result is: " + (num1 / num2));
                    break;
                } else {
                    System.out.println("Can't divide  by 0.");
                    break;
                }
            default:
                System.out.println("Please select between 1 and 4.");
                break;
        }
    }
}
