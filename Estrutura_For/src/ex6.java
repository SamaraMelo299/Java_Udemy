import java.util.Scanner;

public class ex6 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ler um número inteiro N e calcular todos os seus divisores.

        System.out.println("Digite um número:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();

    }
}
