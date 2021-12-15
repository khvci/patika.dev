/* 
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
Formül

Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐) 
*/

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Hipotenus {
    public static void main(String[] args) {
        double a,b,c,cevre,yariCevre,alan;

        Scanner girdi = new Scanner(System.in);

        System.out.print("a kenarını girin: ");
        a = girdi.nextDouble();

        System.out.print("b kenarını giriniz: ");
        b = girdi.nextDouble();

        System.out.print("c kenarını giriniz: ");
        c = girdi.nextDouble();

        cevre = a + b + c;
        yariCevre = cevre / 2;
      
        alan = sqrt(yariCevre * (yariCevre - a) * (yariCevre - b) * (yariCevre - c));
      
        System.out.println("Ucgenin cevresi " + cevre + " iken, alanı ise " + alan);
    }
}
