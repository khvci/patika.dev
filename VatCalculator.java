// Task: Write a Java program to calculate VAT. If the bill is over 1000, VAT percentage is 8%, otherwise 18%.

import java.util.Scanner;

public class VatCalculator {
    public static void main(String[] args) {
        double amount, vatHigh = 0.18, vatLow = 0.08, result;
      
        Scanner input = new Scanner(System.in);

        System.out.print("Bill Amount: ");
        amount = input.nextDouble();

        result = amount <= 1000 ? amount * vatHigh : amount * vatLow;
      
        System.out.println("Vat is: " + result + " and the total is: " + (result + amount));
    }
}
