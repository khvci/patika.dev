/*
Vücut Kitle İndeksi Hesaplama

Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle 
göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül

Kilo (kg) / Boy(m) * Boy(m)
*/

import java.util.Scanner;

public class BmiCalc {
    public static void main(String[] args) {
        double boy,kilo,bmi;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre, örn; 1,72) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        bmi = kilo / (boy * boy);
        System.out.println("BMI Endeksiniz: " + bmi);

    }
}
