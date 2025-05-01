package ex031002;

import java.util.Scanner;

// public class SayHelloWithName {
//     public static void niceToMeetYou(String name) {

//         System.out.println(name + "さん、こんにちは！");
//     }

//     public static void main(String[] args) {
//         String name;
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("あなたの名前を教えてください");
//         name = scanner.nextLine();
//         scanner.close();

//         niceToMeetYou(name);

//     }
// }

public class SayHelloWithName {
    public static void niceToMeetYou(String name) {

        System.out.println(name + "さん、こんにちは！");
    }

    static void inputName() {
        String name;
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        niceToMeetYou(name);
    }

    public static void main(String[] args) {

        System.out.println("あなたの名前を教えてください");
        inputName();
        inputName();
        inputName();
        inputName();
    }
}

// 2
// public class SayHelloWithName {

// public static void StringName(String name) {
// System.out.println(name+"さん,こんにちは！");
// }

// public static void main(String[] args) {
// String[] name = { "パンダ", "たぬき", "うさぎ" };

// for (int i = 0; i < 3; i++) {
// StringName(name[i]);
// }
// }
// }

// public class SayHelloWithName {
// public static String StringName(String name) {
// return name + "さん,こんにちは！";
// }

// public static void main(String[] args) {
// String[] name = { "パンダ", "たぬき", "うさぎ" };

// for (int i = 0; i < 3; i++) {
// System.out.print(StringName(name[i]));
// }
// }

// }