package Static_Members.src.EX2;

public class Converter {
    public double dollarPrice;
    public double quantityDollarBuy;
    public static final double IOF = 0.06;

    public double Converter(){
        return (quantityDollarBuy * dollarPrice * (1 + IOF));
    }
}

