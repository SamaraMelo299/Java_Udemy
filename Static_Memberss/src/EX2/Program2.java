package EX2;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Converter currencyConverter = new Converter();

        System.out.print("What is the dollar price? ");
        currencyConverter.dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        currencyConverter.quantityDollarBuy = sc.nextDouble();

        System.out.printf("Amount to be paid in trais %.2f%n",  currencyConverter.Converter());

        sc.close();
    }
}
