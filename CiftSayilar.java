/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını 
hesaplayan programı yazınız.
*/

import java.util.Scanner;

public class CiftSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        int limit = input.nextInt();

        System.out.print("1'den " + limit + "'e kadar olan sayılardan 3 ve 4'e tam bölünebilenler: ");
        
        for (int i = 1; i <= limit; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
