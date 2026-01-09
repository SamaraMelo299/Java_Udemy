package POO.src.EX5;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {
    public void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();

        System.out.println("Enter the grade for the first quarter: ");
        student.n1 = sc.nextDouble();

        System.out.println("Enter the grade for the second quarter: ");
        student.n2 = sc.nextDouble();

        System.out.println("Enter the grade for the third quarter: ");
        student.n3 = sc.nextDouble();

        System.out.println();
        System.out.printf("FINAL GRADE: %.2f%n", student.media());

        if (student.media() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
