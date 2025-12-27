package Vector.EX12;

import java.util.Locale;
import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double media;

        System.out.print("Quantos alunos serão digitados? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        double[] n1 = new double[n];
        double[] n2 = new double[n];

        for(int i = 0; i < n; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %d° aluno:\n", i + 1);
            sc.nextLine();
            nomes[i] = sc.nextLine();
            n1[i] = sc.nextDouble();
            n2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");

        for (int i = 0; i < n; i++) {
            media = (n1[i] + n2[i]) / 2;

            if (media >= 6.0) {
                System.out.printf("%s\n",  nomes[i]);
            }
        }

        sc.close();

    }
}
