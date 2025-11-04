package EX1;

public class Triangle {
    public double a; // atributos da classe
    public double b;
    public double c;

    public double area() { // metódos da classe
        double p = (a + b+ c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

}
