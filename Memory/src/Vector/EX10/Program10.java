package Vector.EX10;

import java.util.Locale;
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, somaPares = 0, nPares = 0;
        double mediaPares;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vet[i] % 2 == 0) {
                somaPares += vet[i];
                nPares ++;
            }
        }

        if (nPares == 0) {
            System.out.println("Nenhum número par!");
        }
        else
        {
            mediaPares = (double) somaPares / nPares;
            System.out.printf("Media dos pares = %.1f\n", mediaPares);
        }

        sc.close();
    }
}
