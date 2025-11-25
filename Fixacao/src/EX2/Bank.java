package EX2;

import java.util.Locale;
import java.util.Scanner;
import java.util.Formatter;


public class Bank {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account = new Account();

        System.out.println("Enter account number: ");
        int NumberAccount = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.println("IS there na initial deposit (Y/N)? ");
        char affirmative = sc.next().charAt(0);

        if (affirmative == 'y' || affirmative == 'Y'){
            System.out.println("Enter initial deposit value: ");
            double initalDeposit = sc.nextDouble();
            account = new Account(NumberAccount, holder, initalDeposit);
        }
        else {
            account = new Account(NumberAccount, holder);
        }

        System.out.println("\nAccount details: ");
        System.out.println(account);

        System.out.print("\nEnter the deposit amount: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated data: " + account);

        System.out.print("\nEnter the withdrawal amount: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated data: " + account);

        sc.close();
    }
}
