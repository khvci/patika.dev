/*
Taksimetre Programı

Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 
    Taksimetre açılış ücreti 10 TL'dir.
*/

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Taksimetre {
    public static void main(String[] args) {
        double km, tarife = 2.2, min = 20, acilis = 10, toplam;
        String message1,message2;

        Scanner input = new Scanner(System.in);

        System.out.print("Km bilgisini giriniz: ");
        km = input.nextDouble();

        toplam = acilis + (km * tarife);
        message1 = "Ödenecek: " + min;
        message2 = "Ödenecek: " + toplam;

        System.out.print(toplam < 20 ? message1 : message2);
    }
}
