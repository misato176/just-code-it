package ex030501;

import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,"UTF-8");
        System.out.println("あなたの名前を入力してください。");
        String name = scanner.nextLine();

        System.out.println( name + "さん、こんにちは");

        System.out.println("あなたは何歳ですか？");
        String age = scanner.nextLine();

        System.out.println( age + "歳なんですね。よろしくお願いします。");

        scanner.close();

        
    }
}
