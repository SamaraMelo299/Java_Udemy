package EX2;

import EX2.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter coverter = new CurrencyConverter();

        System.out.print("What is the dollar price? ");
        coverter.dollar = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        coverter.buy = sc.nextDouble();

        System.out.printf("Amout to be paid in reais = %.2f%n", coverter.calc());

        sc.close();
    }
}