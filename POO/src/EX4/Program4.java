<<<<<<< HEAD
package EX4;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

    public void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + emp);;


        sc.close();
    }
}
=======
package EX4;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

    public void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + emp);;


        sc.close();
    }
}
>>>>>>> 5f2e7b7b2d47634883205b21f4970b7124877c13
