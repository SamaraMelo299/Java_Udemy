package Estrutura_Condicional.src;

import java.util.Scanner;

public class EX1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NÃO NEGATIVO");
        }

        sc.close();
    }
}
