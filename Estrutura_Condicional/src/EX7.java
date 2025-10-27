import java.util.Locale;
import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
        de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
        ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        Se o ponto estiver na origem, escreva a mensagem “Origem”.
        Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
        situação.
         */

        System.out.println("Digite um valor com uma casa decimal, por exemplo 5.0");
        double x = sc.nextDouble();

        System.out.println("Digite outro valor com uma casa decimal, por exemplo 5.0");
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.printf("Origem");
        }
        else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }


        sc.close();
    }
}
