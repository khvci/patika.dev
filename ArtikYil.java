import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl bilgisini giriniz: ");
        int year = input.nextInt();
        boolean isTrue = false;

        if (year % 400 == 0) {
            isTrue = true;
        } else if (year % 4 == 0 && year % 100 != 0){
            isTrue = true;
        }

        System.out.println(isTrue ? year + " bir artık yıldır." : year + " bir artık yıl değildir.");
    }
}
