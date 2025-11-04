import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        X, se for o caso.
         */
        System.out.println("Digite um número:");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}