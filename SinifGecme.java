/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat,fizik,turkce,kimya,muzik,total=0,average;
        int counter = 0;

        System.out.print("Matematik notunuz: ");
        mat = input.nextDouble();
        if (mat >= 0 && mat <= 100) {
            total += mat;
            counter++;
        }

        System.out.print("Fizik notunuz: ");
        fizik = input.nextDouble();
        if (fizik >= 0 && fizik <= 100) {
            total += fizik;
            counter++;
        }

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextDouble();
        if (turkce >= 0 && turkce <= 100) {
            total += turkce;
            counter++;
        }

        System.out.print("Kimya notunuz: ");
        kimya = input.nextDouble();
        if (kimya >= 0 && kimya <= 100) {
            total += kimya;
            counter++;
        }

        System.out.print("Müzik notunuz: ");
        muzik = input.nextDouble();
        if (muzik >= 0 && muzik <= 100) {
            total += muzik;
            counter++;
        }

        average = total / counter;

        System.out.println("Averaj notunuz: " + average);

        if (average >= 55) {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        } else {
            System.out.println("Sınıfta kaldınız.");
        }
    }
}
