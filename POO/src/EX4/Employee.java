<<<<<<< HEAD
package EX4;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }

    public String toString() {
        return name + ", $" + String.format("%.2f", netSalary());
    }

}
=======
package EX4;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }

    public String toString() {
        return name + ", $" + String.format("%.2f", netSalary());
    }

}
>>>>>>> 5f2e7b7b2d47634883205b21f4970b7124877c13
