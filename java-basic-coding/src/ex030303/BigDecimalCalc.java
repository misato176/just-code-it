package ex030303;

import java.math.BigDecimal; //←これが必要

public class BigDecimalCalc {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("1.1");
        BigDecimal b = new BigDecimal("1.1");
        BigDecimal c = new BigDecimal("1.1");

        BigDecimal result =  a.add(b).add(c);
        
        System.out.println( result );

    }
}
