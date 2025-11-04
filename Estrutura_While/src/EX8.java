import java.util.Scanner;

public class EX8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
         */

        System.out.println("Digite o valor de X:");
        int x = sc.nextInt();

        System.out.println("Digite o valor de Y:");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            }
            else {
                System.out.println("Quarto");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
