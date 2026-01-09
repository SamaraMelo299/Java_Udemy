package Estrutura_Sequencial.src;

import java.util.Locale;
import java.util.Scanner;

public class EX6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.
         */


        double a, b, c, triangulo, pi, circulo, trapezio, quadrado, retangulo;

        System.out.printf("Digite um valor com ponto flutuante de dupla precisão:");
        a = sc.nextDouble();
        System.out.printf("Digite outro valor com ponto flutuante de dupla precisão:");
        b = sc.nextDouble();
        System.out.printf("Digite mais um valor com ponto flutuante de dupla precisão:");
        c = sc.nextDouble();

        triangulo = a * c / 2;
        pi = 3.14159;
        circulo = pi * Math.pow(c, 2);
        trapezio = (a + b) * c / 2;
        quadrado = b * b;
        retangulo = a * b;

        System.out.printf("TRIÂNGULO: %.3f%n", triangulo);
        System.out.printf("CÍRCULO: %.3f%n", circulo);
        System.out.printf("TRAPÉZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETÂNGULO: %.3f%n", retangulo);

        sc.close();
    }
}
