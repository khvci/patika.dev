/*
Koşullar :

    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 */

import java.util.Scanner;

public class ActivitySuggestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the temperature? (C): ");
        int temp = input.nextInt();

        if (temp < 5) {
            System.out.println("You can ski!");
        } else if (temp > 25) {
            System.out.println("You can swim!");
        } else if (temp <= 15) {
            System.out.println("You can go to cinema!");
        }

        if (temp >= 10 && temp <= 25) {
            System.out.println("You can go to picnic!");
        }
    }
}
