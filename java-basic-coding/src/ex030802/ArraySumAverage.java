package ex030802;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ArraySumAverage {
    public static void main(String[] args) {
        int[] scores = {89,30,10,67,43,98,100,78};

        BigDecimal sum = new BigDecimal( 0 ) ;

        for(int score : scores){
           sum = sum.add(new BigDecimal (score)); //scoreの要素すべての和(sum)を求める式を記載　Bigdecimal
               
        }
        BigDecimal Avg = sum.divide ( new BigDecimal( scores.length )); //scoreの要素すべての平均(Avg)を求める式を記載　Bigdecimal

        Avg = Avg.setScale(3, RoundingMode.HALF_UP);//割り切れない数字となるため、小数点台3位までを残して四捨五入をする丸め処理を実施

        System.out.printf("%15s %15s%n", "合計：" + sum , "平均" + Avg);



    }
}
