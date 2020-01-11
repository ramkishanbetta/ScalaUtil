import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal(0.000000001);
        System.out.println(bd);
        System.out.println(String.format("%9f",new BigDecimal(bd.toPlainString())));

        Double d = 0.000000001;
        System.out.println(d);
        System.out.println(String.format("%.9f", d));

    }
}
