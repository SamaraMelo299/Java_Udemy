package EX2;

import java.util.Locale;
import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;

public class Bank {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.print("Enter account number: ");
        double number = sc.nextDouble();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n? ");
        String affirmative = sc.nextLine();

        System.out.print("Enter initial deposit value: ");
        double depositInitial = sc.nextDouble();

        sc.close();
    }
}
