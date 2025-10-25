import java.util.Locale;
import java.util.Scanner;

public class EX5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
         */

        int codigo1, codigo2, pecas1, pecas2;
        double valor1, valor2, total;

        // Peças 1
        System.out.println("Digite o código da peça 1:");
        codigo1 = sc.nextInt();
        System.out.println("Digite a quantidade de peças 1:");
        pecas1  = sc.nextInt();
        System.out.printf("Digite o valor unitário da peça 1:");
        valor1 = sc.nextDouble();


        // Peças 2
        System.out.printf("Digite o código da peça 2:");
        codigo2  = sc.nextInt();
        System.out.println("Digite a quantidade de peças 2:");
        pecas2  = sc.nextInt();
        System.out.printf("Digite o valor unitário da peça 2:");
        valor2 = sc.nextDouble();

        //Total
        total = pecas1 * valor1 + pecas2 *valor2;

        System.out.printf("Valor a pagar: R$%.2f%n", total);

        sc.close();
    }
}
    