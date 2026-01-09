package Memory.src.Vector.EX7;

import java.util.Locale;
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, posMaior;
        double maior;

        System.out.print("Quantos números você vai digitar? ");
        n = sc.nextInt();

        double[] vet = new double[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextDouble();
        }

        maior = vet[0];
        posMaior = 0;

        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                posMaior = i;
            }
        }

        System.out.printf("\nMaior Valor = %.1f\n", maior);
        System.out.printf("Posicao do Maior Valor = %d\n", posMaior);

    }
}
