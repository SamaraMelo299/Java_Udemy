package Vector.EX3;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        People[] people = new People[n];
        
        for (int i = 0; i < people.length ; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            sc.nextLine();

            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();

            System.out.print("Altura: ");
            double height = sc.nextDouble();

            people[i] = new People(name, age, height);
        }

        int countUnder16 = 0;
        double totalHeight = 0.0;

        for (int i = 0; i < people.length ; i++) {
            if (people[i].getAge() < 16) {
                countUnder16++;
            }
            totalHeight += people[i].getHeight();
        }

        double mediaHeight = totalHeight / n;
        double percentual = ((double) countUnder16 / n) * 100.0;

        System.out.printf("\nAltura media = %.2f%n", mediaHeight);
        System.out.printf("Pessoas com menos de 16 anos: %d (%.1f%%)%n", countUnder16, percentual);

        for(int i=0; i<n; i++) {
            if (people[i].getAge() < 16) {
                System.out.printf("%s\n", people[i].getName());
            }
        }

        sc.close();
    }
}
