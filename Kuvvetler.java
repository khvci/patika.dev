/*
Ödev

Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
*/

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Kuvvetler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> numbers = new TreeSet<>();

        System.out.print("Lütfen bir sayı giriniz: ");
        int userInput = input.nextInt();

        if (userInput < 1) {
            System.out.print("Geçersiz değer.");
        } else {
            for (int i = 1; i <= userInput; i *= 4) {
                numbers.add(i);
            }
            for (int j = 1; j <= userInput; j *= 5) {
                numbers.add(j);
            }

            System.out.print("4 ve 5'in kuvvetleri sıralı liste: " + numbers);
        }

    }
}

/*
Input:
Lütfen bir sayı giriniz: 1000

Output:
4 ve 5'in kuvvetleri sıralı liste: [1, 4, 5, 16, 25, 64, 125, 256, 625]
 */
