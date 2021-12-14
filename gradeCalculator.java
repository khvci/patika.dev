import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        int math, science, chemistry, language, history, arts;

        Scanner inp = new Scanner(System.in);

        System.out.print("Math Score: ");
        math = inp.nextInt();

        System.out.print("Science Score: ");
        science = inp.nextInt();

        System.out.print("Chemistry Score: ");
        chemistry = inp.nextInt();

        System.out.print("Language Score: ");
        language = inp.nextInt();

        System.out.print("History Score: ");
        history = inp.nextInt();

        System.out.print("Arts Score: ");
        arts = inp.nextInt();

        double result = (math + science + chemistry + language + history + arts) / 6.0;

        System.out.println("Result: " + result);
        System.out.println(result >= 60 ? "Passed" : "Failed");
    }
}
