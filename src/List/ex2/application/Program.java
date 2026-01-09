package List.ex2.application;

import List.ex2.entities.Employees;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Employees> employees = new ArrayList<>();

        System.out.print("Haw many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ": ");
            sc.nextLine();
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employees emp = new Employees(id, name, salary);
            employees.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        Integer increaseSalaryId = sc.nextInt();
        Employees emp =  employees.stream().filter(e -> e.getId() == increaseSalaryId).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This ID does not exist");
        }
        else {
            System.out.print("Enter the percentage: ");
            Double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println("List of employees: ");
        for (Employees e : employees) {
            System.out.printf("%d, %s, %.2f%n", e.getId(), e.getName(), e.getSalary());
        }

        sc.close();
    }
}
