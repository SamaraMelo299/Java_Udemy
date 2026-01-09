package Vector.Pensionato;
import Vector.Pensionato.entities.Rent;


import java.util.Locale;
import java.util.Scanner;


public class Pensionato {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rent[] room = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room (1 to 9): ");
            int roomNumber = sc.nextInt();
            room[roomNumber] = new Rent(name, email, roomNumber);
        }
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < room.length; i++) {
            if (room[i] != null) {
                System.out.println(room[i]);
            }
        }
        sc.close();
    }
}
