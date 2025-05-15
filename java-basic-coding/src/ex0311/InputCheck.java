package ex0311;

import java.util.Scanner;

public class InputCheck {
    public static void main(String[] args) {
        System.out.print("数値を入力してください:");
        Scanner scanner = new Scanner(System.in);// Scannerを用意
        String num = scanner.nextLine();// 入力された文字列を取得

        try {
            int tryResult = Integer.parseInt(num);
            System.out.println("入力した数値は" + tryResult);

        } catch (NumberFormatException e) {// 例外に対してエラーメッセージを表示する
            System.out.print("数値以外が入力されました。");

        }

    }

}
