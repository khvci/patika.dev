/*
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı 
"For Döngüsü" kullanarak yapınız.
*/

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 1;

        System.out.print("Taban Değeri: ");
        int taban = input.nextInt();

        System.out.print("Üs Değeri: ");
        int us = input.nextInt();

        for (int i = 1; i <= us; i++) {
            result *= taban;
        }

        if (us < 0) {
            System.out.print("Pozitif üs değeri giriniz.");
        } else {
            System.out.print(taban + "^" + us + " = " + result);
        }

    }
}

/*

Input:
7
4

Output:
7^4 = 2401

*/
