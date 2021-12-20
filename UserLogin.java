import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName = "patika", password = "java123", userNameInput, passInput;

        System.out.print("User: ");
        userNameInput = input.nextLine();

        System.out.print("Password: ");
        passInput = input.nextLine();

        if (userNameInput.equals("patika") && passInput.equals("java123")) {
            System.out.println("Successful Login!");
        } else {
            System.out.print("Wrong Credentials! Do you want to reset password? (y/n): ");
            String answer = input.nextLine();

            if (answer.equals("y")) {

                boolean isSame = true;

                while (isSame == true) {
                    System.out.print("New password: ");
                    String newPassword = input.nextLine();

                    if (password.equals(newPassword)) {
                        System.out.println("Please choose a different password.");
                    } else {
                        password = newPassword;
                        isSame = false;
                        System.out.println("New password is " + password);
                    }
                }
            } else {
                System.out.println("Login failed.");
            }
        }
    }
}
