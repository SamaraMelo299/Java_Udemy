import java.util.Locale;
import java.util.Scanner;

public class EX4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais.
         */

        System.out.println("Digite o número do funcionário:");
        int funcionario = sc.nextInt();

        System.out.println("Digite o número de horas trabalhadas:");
        double horas = sc.nextDouble();

        System.out.println("Digite o valor que recebe por hora:");
        double valorh = sc.nextDouble();

        double calc = horas * valorh;
        System.out.println("Funcionário: " + funcionario);
        System.out.printf("Salário: U$%.2f%n", calc);

        sc.close();
    }
}
    