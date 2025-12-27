package Vector.EX11;

import java.util.Locale;
import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, maiorIdade, posicaoMaior;

        System.out.print("Quantas pessoas vão digitar? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %dª pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        maiorIdade = idades[0];
        posicaoMaior = 0;

        for (int i = 1; i < n; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("Pessoa mais velha:  %s\n", nomes[posicaoMaior]);

        sc.close();
    }
}
