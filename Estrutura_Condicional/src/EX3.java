<<<<<<< HEAD
import java.util.Scanner;

public class EX3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.println("DIGITE UM NÚMERO:");
        A = sc.nextInt();
        System.out.println("DIGITE OUTRO NÚMERO:");
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("SÃO MÚLTIPLOS");
        }
        else {
            System.out.println("NÃO SÃO MÚLTIPLOS");
        }

        sc.close();
    }
}
=======
import java.util.Scanner;

public class EX3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.println("DIGITE UM NÚMERO:");
        A = sc.nextInt();
        System.out.println("DIGITE OUTRO NÚMERO:");
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("SÃO MÚLTIPLOS");
        }
        else {
            System.out.println("NÃO SÃO MÚLTIPLOS");
        }

        sc.close();
    }
}
>>>>>>> 5f2e7b7b2d47634883205b21f4970b7124877c13
    