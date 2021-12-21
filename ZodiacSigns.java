import java.util.Scanner;

public class ZodiacSigns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte month,day;
        String zodiac = "undefined yet.";

        System.out.print("Month of birthday: ");
        month = input.nextByte();

        System.out.print("Day of birthday: ");
        day = input.nextByte();

        switch (month) {
            case 1:
                if (day < 20 && day > 0) {
                    zodiac = "Capricorn.";
                } else if (day >= 20 && day <= 31) {
                    zodiac = "Aquarius.";
                } else {
                    System.out.print("Check the day. ");
                }
                break;
            case 2:
                if (day < 19 && day > 0) {
                    zodiac = "Aquarius.";
                } else if (day >= 19 && day <= 29) {
                    zodiac = "Pisces.";
                } else {
                    System.out.print("Check the day. ");
                }
                break;
            case 3:
                if (day < 21 && day > 0) {
                    zodiac = "Pisces.";
                } else if (day >= 21 && day <= 31) {
                    zodiac = "Aries.";
                } else {
                    System.out.print("Check the day. ");
                }
                break;
            case 4:
                if (day < 20 && day > 0) {
                    zodiac = "Aries.";
                } else if (day >= 20 && day <= 31) {
                    zodiac = "Taurus.";
                } else {
                    System.out.print("Check the day. ");
                }
                break;
            case 5:
                if (day < 21 && day > 0) {
                    zodiac = "Taurus.";
                } else if (day >= 21 && day <= 31) {
                    zodiac = "Gemini.";
                } else {
                    System.out.print("Check the day. ");
                }
                break;
            case 6:
                if (day < 21 && day > 0) {
                    zodiac = "Gemini.";
                } else if (day >= 21 && day <= 30) {
                    zodiac = "Cancer.";
                } else {
                    System.out.print("Check the day. ");
                }
                break;
            case 7:
                if (day < 23 && day > 0) {
                    zodiac = "Cancer.";
                } else if (day >= 23 && day <= 31) {
                    zodiac = "Leo.";
                } else {
                    System.out.print("Check the day. ");
                }
                break;
            case 8:
                if (day < 23 && day > 0) {
                    zodiac = "Leo.";
                } else if (day >= 23 && day <= 31) {
                    zodiac = "Virgo.";
                } else {
                    System.out.print("Check the day. ");
                }
                break;
            case 9:
                if (day < 23 && day > 0) {
                    zodiac = "Virgo.";
                } else if (day >= 23 && day <= 30) {
                    zodiac = "Libra.";
                } else {
                    System.out.print("Check the day. ");
                }
                break;
            case 10:
                if (day < 23 && day > 0) {
                    zodiac = "Libra.";
                } else if (day >= 23 && day <= 31) {
                    zodiac = "Scorpio.";
                } else {
                    System.out.print("Check the day. ");
                }
                break;
            case 11:
                if (day < 22 && day > 0) {
                    zodiac = "Scorpio.";
                } else if (day >= 22 && day <= 30) {
                    zodiac = "Sagittarius.";
                } else {
                    System.out.print("Check the day. ");
                }
                break;
            case 12:
                if (day < 20 && day > 0) {
                    zodiac = "Sagittarius.";
                } else if (day >= 20 && day <= 31) {
                    zodiac = "Aquarius.";
                } else {
                    System.out.print("Check the day. ");
                }
                break;
            default:
                System.out.print("Check the month. ");
                break;

        }
        System.out.println("Your zodiac sign is " + zodiac);
    }
}
