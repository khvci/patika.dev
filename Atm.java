// demo user: khvci
// demo password: 1234

// try this on replit.com --> https://replit.com/@khvci/BasicBank#Main.java
// replit.com is slow but still works. it takes 5 seconds to load at first, be patient. 


import java.util.Scanner;

public class Atm {
    static boolean auth(String user, String pass) {
        if (user.equals("khvci") && pass.equals("1234")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user, pass;
        boolean auth = false;
        byte triesLeft = 3;
        double balance = 5000;

        System.out.println("Welcome to Basic Bank! \n" +
                "demo user: khvci\n" +
                "demo password: 1234\n");

        do {
            System.out.println("You have " + triesLeft + " tries left.");
            System.out.print("User: ");
            user = input.nextLine();

            System.out.print("Password: ");
            pass = input.nextLine();

            auth = auth(user,pass);
            triesLeft--;
            if (!auth) {
                System.out.println("\nWrong Credentials!");
            }
        } while (triesLeft > 0 && !auth);

        if (auth) {
            System.out.println("\nSuccessful Login!");

            byte selection = 0;

            while (selection < 1 || selection > 4) {
                System.out.println("\nMenu:\n" +
                        "1 - Check Account Balance\n" +
                        "2 - Add Money\n" +
                        "3 - Withdraw Money\n" +
                        "4 - Exit");

                System.out.print("\nPlease select an option: ");
                selection = input.nextByte();

                switch (selection) {
                    case 1:
                        System.out.print("Your balance is " + balance + " USD.");
                        break;

                    case 2:
                        System.out.print("How much do you want to add: ");
                        double amountAdd = input.nextDouble();

                        if (amountAdd > 0) {
                            balance += amountAdd;
                            System.out.print("New balance is " + balance + " USD.");
                        } else {
                            System.out.print("Failed. Please provide a positive amount.");
                        }
                        break;

                    case 3:
                        System.out.print("How much do you want to withdraw: ");
                        double amountWithdraw = input.nextDouble();

                        if (amountWithdraw < 0) {
                            System.out.print("Failed. Please provide a positive amount.");
                        } else if (amountWithdraw <= balance) {
                            balance -= amountWithdraw;
                            System.out.print("New balance is " + balance + " USD.");
                        } else {
                            System.out.print("Failed. Insufficient funds. Your balance is " + balance + " USD.");
                        }
                        break;

                    case 4:
                        break;

                    default:
                        System.out.print("Undefined request.");
                }

                if (selection != 4) {
                    input.nextLine();
                    String cont = "";

                    do {
                        System.out.print(" Do you want to continue? (y / n): ");
                        cont = input.nextLine();
                    } while (!(cont.equals("y") || cont.equals("n")));

                    if (cont.equals("y")) {
                        selection = 0;
                    }
                }
            }
        } else {
            System.out.print("Your account has been blocked.");
        }

        System.out.println("\nGoodbye!");
    }
}
