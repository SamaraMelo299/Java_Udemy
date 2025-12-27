package Vector.EX6;

import java.util.Locale;
import java.util.Scanner;

public class Program6 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < vet.length ; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros Pares: ");

        int pares = 0;
        for (int i = 0; i < vet.length ; i++) {
            if (vet[i] % 2 == 0) {
                System.out.printf("%d ", vet[i]);
                pares++;
            }
        }

        System.out.printf("\n\nQuantidade de pares = %d\n", pares);

        sc.close();
    }
}
