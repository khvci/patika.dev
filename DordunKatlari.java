/*
Ödev

Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift 
ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/

import java.util.Scanner;

public class DordunKatlari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0,userInput;

        do {
            System.out.print("Lütfen bir sayı giriniz: ");
            userInput = input.nextInt();

            if (userInput % 4 == 0) {
                total += userInput;
            }
        } while (userInput >= 0);

        System.out.print("Girilen pozitif ve 4'e tam bölünebilen sayıların toplamı " + total + " eder.");
    }
}
