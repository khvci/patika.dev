/*
Dairenin Alanını ve Çevresini Hesaplayan Program

Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev

Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
*/

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        double pi = 3.14,r,angle,cevre,alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Daire yarıçapını giriniz: ");
        r = input.nextDouble();
        System.out.print("Merkez açısını giriniz: ");
        angle = input.nextDouble();

        if (angle > 360) {
            System.out.println("Açı en fazla 360 olabilir.");
        } else if ( angle == 360) {
            cevre = 2 * pi * r;
            System.out.println("Dairenin çevresi: " + cevre);

            alan = pi * r * r;
            System.out.println("Dairenin alanı: " + alan);
        } else {
            cevre = (2 * r) + (2 * pi * r * angle / 360);
            System.out.println("Şeklin çevresi: " + cevre);

            alan = (pi * r * r * angle) /360;
            System.out.println("Şeklin alanı: " + alan);
        }
    }
}
