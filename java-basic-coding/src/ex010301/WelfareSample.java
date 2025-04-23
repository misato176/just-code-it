package ex010301;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * このプログラムは、元本、毎月の加算額、年利を指定して、
    * 複利運用（年利計算）と貯金のみを行った場合の資産額を年ごとに比較します。
    * デフォルト値が設定されていますが、ユーザー入力によってカスタマイズ可能です。
    */
public class WelfareSample {

    // 1年間の月数（12ヶ月）
    private static final BigDecimal MONTHS_IN_YEAR = new BigDecimal("12");

    public static void main(String[] args) {
        // 標準入力用のスキャナー
        try (Scanner scanner = new Scanner(System.in)) {

            // 初期元本（デフォルト: 10万円）
            BigDecimal principal = new BigDecimal("100000");
            // 毎月の加算額（デフォルト: 2万円）
            BigDecimal monthlyAmount = new BigDecimal("20000");
            // 年利（パーセンテージ）（デフォルト: 5%）
            BigDecimal annualInterestRatePercent = new BigDecimal("7");
            // 年利（計算用: 1 + 年利%/100, デフォルト: 1.05）
            BigDecimal annualInterestRate = annualInterestRatePercent.divide(new BigDecimal("100")).add(BigDecimal.ONE);

            // 運用年数（デフォルト: 10年）
            int years = 10;

            // ユーザー入力: 元本
            try {
                System.out.printf("元本を入力してください（例: %s円）: ", principal.toBigInteger());
                principal = new BigDecimal(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("無効な入力です。デフォルト値を使用します: " + principal.toBigInteger() + "円");
            }

            // ユーザー入力: 毎月の加算額
            try {
                System.out.printf("毎月の加算額を入力してください（例: %s円）: ", monthlyAmount.toBigInteger());
                monthlyAmount = new BigDecimal(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("無効な入力です。デフォルト値を使用します: " + monthlyAmount.toBigInteger() + "円");
            }

            // 複利運用額（初期値は元本と同じ）
            BigDecimal compoundAmount = principal;
            // 貯金額（初期値は元本と同じ）
            BigDecimal savings = principal;

            // 出力フォーマット設定（3桁区切りのカンマ）
            DecimalFormat formatter = new DecimalFormat("#,###");

            // ヘッダー出力
            System.out.printf("%-8s %-13s %-13s\n", "[年]", "[貯金]", "[複利運用(年利" + annualInterestRatePercent + "%)]");

            // 各年ごとの金額を計算して出力
            for (int year = 1; year <= years; year++) {
                // 複利運用額の計算
                // 複利運用額 = (現在の運用額 + (加算額 * 12)) * 年利
                compoundAmount = compoundAmount.add(monthlyAmount.multiply(MONTHS_IN_YEAR)).multiply(annualInterestRate);
                // 四捨五入で小数点以下を切り捨て
                compoundAmount = compoundAmount.setScale(0, RoundingMode.HALF_UP);

                // 貯金額の計算
                // 貯金額 = 現在の貯金額 + (加算額 * 12)
                savings = savings.add(monthlyAmount.multiply(MONTHS_IN_YEAR));

                // 各年の金額をフォーマットして出力
                System.out.printf("%2d年目 %13s円 %13s円\n", year, formatter.format(savings), formatter.format(compoundAmount));
            }

            // 計算完了メッセージ
            System.out.println("計算が完了しました。ご利用ありがとうございます！");
        }
    }
}
