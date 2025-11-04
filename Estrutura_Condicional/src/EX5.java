<<<<<<< HEAD
import java.util.Locale;
import java.util.Scanner;

public class EX5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        seguir, calcule e mostre o valor da conta a pagar.
         */

        int codigo;
        String[] produto = {" ", "Cachorro Quente", "X-Salada", "X-Bacon", "Torrada Simples", "Refrigerante"};
        double[] precos = {0, 4.00, 4.50, 5.00, 2.00, 1.50};

        System.out.println("CARDÁPIO DO DIA: \n" +
                "1 - " + produto[1] + "\n" +
                "2 - " + produto[2] + "\n" +
                "3 - " + produto[3] + "\n" +
                "4 - " + produto[4] + "\n" +
                "5 - " + produto[5] + "\n" +
                "\nDigite o código do produto:");

        codigo = sc.nextInt();

        if (codigo <= 0 || codigo > 5) {
            System.out.println("Opção inválida, digite outro número!");
        }
        else {
            System.out.println("Você escolheu " + produto[codigo] + "! \n");

            System.out.println("Digite a quantidade:");
            int quantidade = sc.nextInt();

            double total = quantidade * precos[codigo];
            System.out.printf("Total: R$%.2f%n", total);
        }

        sc.close();
    }
=======
import java.util.Locale;
import java.util.Scanner;

public class EX5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        seguir, calcule e mostre o valor da conta a pagar.
         */

        int codigo;
        String[] produto = {" ", "Cachorro Quente", "X-Salada", "X-Bacon", "Torrada Simples", "Refrigerante"};
        double[] precos = {0, 4.00, 4.50, 5.00, 2.00, 1.50};

        System.out.println("CARDÁPIO DO DIA: \n" +
                "1 - " + produto[1] + "\n" +
                "2 - " + produto[2] + "\n" +
                "3 - " + produto[3] + "\n" +
                "4 - " + produto[4] + "\n" +
                "5 - " + produto[5] + "\n" +
                "\nDigite o código do produto:");

        codigo = sc.nextInt();

        if (codigo <= 0 || codigo > 5) {
            System.out.println("Opção inválida, digite outro número!");
        }
        else {
            System.out.println("Você escolheu " + produto[codigo] + "! \n");

            System.out.println("Digite a quantidade:");
            int quantidade = sc.nextInt();

            double total = quantidade * precos[codigo];
            System.out.printf("Total: R$%.2f%n", total);
        }

        sc.close();
    }
>>>>>>> 5f2e7b7b2d47634883205b21f4970b7124877c13
}