<<<<<<< HEAD
import java.util.Scanner;

public class EX9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível.
         */

        String[] product = {"", "Álcool", "Gasolina", "Diesel", "Fim"};
        int[] number = {0, 1, 2, 3, 4};

        int input = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Combústiveis disponíveis: \n" +
                number[1] + " - " + product[1] + "\n" +
                number[2] + " - " + product[2] + "\n" +
                number[3] + " - " + product[3] + "\n" +
                number[4] + " - " + product[4]);

        while (input != 4) {
            System.out.println("Digite o número do combústivel desejado ou selecione o fim do programa:");
            input = sc.nextInt();

            if (input == 1) {
                alcool += 1;
                System.out.println("Álcool recebeu 1 voto!");
            } else if (input == 2) {
                gasolina += 1;
                System.out.println("Gasolina recebeu 1 voto!");
            } else if (input == 3) {
                diesel += 1;
                System.out.println("Diesel recebeu 1 voto!");
            }
        }

                System.out.println("MUITO OBRIGADO! \n" +
                        "Álcool: " + alcool + "\n" +
                        "Gasolina: " + gasolina + "\n" +
                        "Diesel: " + diesel);

                sc.close();
            }
        }




=======
import java.util.Scanner;

public class EX9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível.
         */

        String[] product = {"", "Álcool", "Gasolina", "Diesel", "Fim"};
        int[] number = {0, 1, 2, 3, 4};

        int input = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Combústiveis disponíveis: \n" +
                number[1] + " - " + product[1] + "\n" +
                number[2] + " - " + product[2] + "\n" +
                number[3] + " - " + product[3] + "\n" +
                number[4] + " - " + product[4]);

        while (input != 4) {
            System.out.println("Digite o número do combústivel desejado ou selecione o fim do programa:");
            input = sc.nextInt();

            if (input == 1) {
                alcool += 1;
                System.out.println("Álcool recebeu 1 voto!");
            } else if (input == 2) {
                gasolina += 1;
                System.out.println("Gasolina recebeu 1 voto!");
            } else if (input == 3) {
                diesel += 1;
                System.out.println("Diesel recebeu 1 voto!");
            }
        }

                System.out.println("MUITO OBRIGADO! \n" +
                        "Álcool: " + alcool + "\n" +
                        "Gasolina: " + gasolina + "\n" +
                        "Diesel: " + diesel);

                sc.close();
            }
        }




>>>>>>> 5f2e7b7b2d47634883205b21f4970b7124877c13
