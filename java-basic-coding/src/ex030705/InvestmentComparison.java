package ex030705;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class InvestmentComparison {
    public static void main(String[] args) {
        BigDecimal base = new BigDecimal(100000);        //元本
        BigDecimal profit = new BigDecimal (7);        //年利
        BigDecimal stack = new BigDecimal(240000);       //1年の積み立て
        BigDecimal profitcalc = profit.divide(new BigDecimal("100")).add(BigDecimal.ONE); //年利の計算
        int year = 10;            //運用年数

        //複利運用 
        BigDecimal management = base;
        //貯金
        BigDecimal saving = base;  //名前はもう少し工夫するべき

    

        for(int i = 1; i <= year; i++){

            management = management.add(stack).multiply(profitcalc);
            management = management.setScale(0, RoundingMode.HALF_UP);
            
            saving =  saving.add(stack);


            DecimalFormat df = new DecimalFormat(",###,###円");
            String formatted = df.format(management);//出力フォーマット

            DecimalFormat df2 = new DecimalFormat(",###,###円");
            String formatted2 = df2.format(saving);//出力フォーマット
            
            System.out.printf("%15s %15s %15s%n", i + "年目", formatted2  , formatted );
            //カンマ区切りはprintfでできる。
        }

    }
}
