package EX5;

public class Student {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double media() {
        return n1 + n2 + n3;
    }

    public double missingPoints() {
        if (media() < 60.0) {
            return 60.0 - media();
        }
        else {
            return 0.0;
        }
    }
}
