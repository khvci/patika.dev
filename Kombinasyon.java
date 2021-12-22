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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, nFaktor = 1, rFaktor = 1, difFactor = 1, result;

        System.out.print("n sayısı: ");
        n = input.nextInt();

        System.out.print("r sayısı: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            nFaktor *= i;
        }

        for (int j = 1; j <= r; j++) {
            rFaktor *= j;
        }

        for (int k = 1; k <= n - r; k++) {
            difFactor *= k;
        }
        // 3 defa for-loop yazmak mantıklı değil, fonksiyon yazmayı öğrenince güncelle.

        result = nFaktor / (rFaktor * difFactor);
        
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
