package Estrutura_While.src;

import java.lang.Math;

public class EX3 {

    public static void main(String[] args) {

        double x = 100;
        double y = 100;

        while (x != y) {
            System.out.print("Olha");
            x = Math.sqrt(y);
        }
    }
}

