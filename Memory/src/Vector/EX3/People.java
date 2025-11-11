package Vector.EX3;

public class People {
    private String name;
    private int age;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public People(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    //  Cálculo da média de altura
    public static double calcularMediaAltura(People[] pessoas) {
        double soma = 0.0;
        for (int i = 0; i < pessoas.length; i++) {
            soma += pessoas[i].getHeight();
        }
        return soma / pessoas.length;
    }

    //  Contar menores de 16 anos
    public static int contarMenoresDe16(People[] pessoas) {
        int count = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getAge() < 16) {
                count++;
            }
        }
        return count;
    }

    //  Calcular percentual de menores de 16
    public static double percentualMenoresDe16(People[] pessoas) {
        int menores = contarMenoresDe16(pessoas);
        return ((double) menores / pessoas.length) * 100.0;
    }

}
