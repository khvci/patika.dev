import java.util.Scanner;

public class FlightCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km,age,isReturn,tariff = 0.1,sum,ageDiscount = 1,roundTripDisc = 1;

        System.out.print("Distance (km): ");
        km = input.nextDouble();

        System.out.print("Your Age: ");
        age = input.nextDouble();

        System.out.println("Please select:\n1 - One-way\n2 - Round-trip");
        isReturn = input.nextDouble();

        if (km < 0 || age < 0 || isReturn < 0 || isReturn > 2) {
            System.out.println("Please check the information that you provided.");
        } else {

            if (age < 12) {
                ageDiscount = 0.5;
            } else if (age >= 12 && age < 24) {
                ageDiscount = 0.9;
            } else if (age > 65) {
                ageDiscount = 0.7;
            }

            if (isReturn == 2) {
                roundTripDisc = 1.6; // multiply with 2 (round-trip), then 0.8 for discount.
            }

            sum = km * tariff * ageDiscount * roundTripDisc;
            System.out.print("Total price: " + sum);
        }
    }
}
