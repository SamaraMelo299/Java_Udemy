<<<<<<< HEAD
import java.util.Locale;
import java.util.Scanner;

public class ex4 {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
           Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
           segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
         */

        System.out.println("Digite um número:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("Divisão impossível!");
            }
            else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }
        sc.close();
    }
}
=======
import java.util.Locale;
import java.util.Scanner;

public class ex4 {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
           Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
           segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
         */

        System.out.println("Digite um número:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("Divisão impossível!");
            }
            else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }
        sc.close();
    }
}
>>>>>>> 5f2e7b7b2d47634883205b21f4970b7124877c13
