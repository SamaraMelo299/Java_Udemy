package EX2.util;

public class CurrencyConverter {
    public double dollar;
    public double buy;
    public double iof = 0.06;

    public double calc(){
        return (buy * dollar * (1 + iof));
    }

}
