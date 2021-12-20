/*
Ödev:

Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
*/

import java.util.Scanner;

public class NumberOrders {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;

        System.out.print("a sayısı: ");
        a = input.nextInt();

        System.out.print("b sayısı: ");
        b = input.nextInt();

        System.out.print("c sayısı: ");
        c = input.nextInt();

        if (a == b || a == c || b == c) {
            System.out.println("Lütfen farklı sayılar giriniz.");
        } else {
            if (a > b && a > c) {
                if (b > c) {
                    System.out.println("a > b > c");
                } else {
                    System.out.println("a > c > b");
                }
            } else if ( b > a && b > c) {
                if (a > c) {
                    System.out.println("b > a > c");
                } else {
                    System.out.println("b > c > a");
                }
            } else {
                if (a > b) {
                    System.out.println("c > a > b");
                } else {
                    System.out.println("c > b > a");
                }
            }
        }
    }
}
