/*
Manav Kasa Programı

Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
*/

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5;
        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        double armutTot,elmaTot,domatesTot,muzTot,patlicanTot,total;

        System.out.print("Armut Kaç Kilo? ");
        armutKg = input.nextDouble();
        armutTot = armut * armutKg;

        System.out.print("Elma Kaç Kilo? ");
        elmaKg = input.nextDouble();
        elmaTot = elma * elmaKg;

        System.out.print("Domates Kaç Kilo? ");
        domatesKg = input.nextDouble();
        domatesTot = domates * domatesKg;

        System.out.print("Muz Kaç Kilo? ");
        muzKg = input.nextDouble();
        muzTot = muz * muzKg;

        System.out.print("Patlıcan Kaç Kilo? ");
        patlicanKg = input.nextDouble();
        patlicanTot = patlican * patlicanKg;

        total = armutTot + elmaTot + domatesTot + muzTot + patlicanTot;
        System.out.println("Toplam Tutar: " + total + " TL");

    }
}
