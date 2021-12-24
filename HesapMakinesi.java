import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b;
        byte selection;

        System.out.println(
                "1 - Toplama\n" +
                "2 - Çıkarma\n" +
                "3 - Çarpma\n" +
                "4 - Bölme\n" +
                "5 - Üslü Sayı Hesaplama\n" +
                "6 - Faktoriyel Hesaplama\n" +
                "7 - Kalan Hesaplama\n" +
                "8 - Dikdörtgen Alan ve Çevre Hesabı\n");
        do {
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            selection = input.nextByte();
        } while (selection < 1 || selection > 8);

        if (selection != 6) {
            System.out.print("Birinci sayı: ");
            a = input.nextDouble();
        } else {
            System.out.print("Sayı: ");
            a = input.nextDouble();
        }

        if (selection != 6) {
            System.out.print("İkinci sayı: ");
            b = input.nextDouble();
        } else {
            b = 0;
        }

        switch (selection) {
            case 1:
                System.out.print("Toplam: " + sum(a,b));
                break;
            case 2:
                System.out.print("Fark: " + dif(a,b));
                break;
            case 3:
                System.out.print("Çarpım: " + mult(a,b));
                break;
            case 4:
                if (b != 0) {
                    System.out.print("Bölüm: " + div(a,b));
                } else {
                    System.out.print("Tanımsız.");
                }
                break;
            case 5:
                if (a == 0) {
                    System.out.println("Sonuç: 0");
                } else if (b < 0) {
                    System.out.println("Sadece pozitif kuvvetler hesaplanır.");
                } else {
                    System.out.println("Sonuç: " + (int)(pow(a,b)));
                }
                break;
            case 6:
                System.out.print((int)(a) + "! = " + (int)(fact(a)));
                break;
            case 7:
                System.out.print("Kalan: " + (int)(mod(a,b)));
                break;
            case 8:
                System.out.print("Alan: " + mult(a,b) + "\nÇevre: " + peri(a,b));
                break;
            default:
                break;

        }
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static double dif(double a, double b) {
        return a - b;
    }

    static double mult(double a, double b) {
        return a * b;
    }

    static double div(double a, double b) {
        return a / b;
    }

    static double pow(double a, double b) {
        int power = 1;
        for (int i = 1; i <= b; i++) {
            power *= a;
        }
        return power;
    }

    static double fact(double a) {
        double fact = 1;

        if (a == 0 || a == 1) {
            return 1;
        } else {
            fact = a * (fact(a - 1));
        }
        return fact;
    }

    static double mod(double a, double b) {
        return a % b;
    }
    
    static double peri(double a, double b) {
        return (a + b) * 2;
    }
}
