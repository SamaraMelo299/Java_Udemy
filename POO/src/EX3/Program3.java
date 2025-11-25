<<<<<<< HEAD
package EX3;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {

    public void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Digite a largura do retângulo: ");
        rectangle.width = sc.nextDouble();

        System.out.println("Digite a altura do retângulo: ");
        rectangle.height = sc.nextDouble();

        rectangle.area();
        rectangle.perimeter();
        rectangle.diagonal();

        System.out.println(rectangle);

        sc.close();
    }
}
=======
package EX3;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {

    public void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Digite a largura do retângulo: ");
        rectangle.width = sc.nextDouble();

        System.out.println("Digite a altura do retângulo: ");
        rectangle.height = sc.nextDouble();

        rectangle.area();
        rectangle.perimeter();
        rectangle.diagonal();

        System.out.println(rectangle);

        sc.close();
    }
}
>>>>>>> 5f2e7b7b2d47634883205b21f4970b7124877c13
