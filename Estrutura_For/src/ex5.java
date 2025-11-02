import java.util.Scanner;

public class ex5 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
           Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
           Lembrando que, por definição, fatorial de 0 é 1.
         */

        System.out.println("Digite um número:");
        int n = sc.nextInt();

        int fat = 1;

        for (int i = 1 ; i <= n; i++) {
            fat = fat * i;
        }

        System.out.println("Seu respectivo fatorial é: " + fat);

        sc.close();

    }
}
