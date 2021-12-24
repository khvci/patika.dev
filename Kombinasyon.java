/*
Java ile faktöriyel hesaplayan program yazıyoruz.

Ödev

N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı 
n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü:

C(n,r) = n! / (r! * (n-r)!)
*/

import java.util.Scanner;

public class Kombinasyon {
    static int fact(int factNum) {
        int factResult = 1;

        for (int i = 1; i <= factNum; i++) {
            factResult *= i;
        }

        return factResult;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n sayısı: ");
        int n = input.nextInt();

        System.out.print("r sayısı: ");
        int r = input.nextInt();

        int result = fact(n) / (fact(r) * fact(n - r));

        System.out.print("C(" + n + "," + r + ") = " + result);

    }
}


/*

Input:
6
4

Output:
C(6,4) = 15

*/
