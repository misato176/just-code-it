package ex031003;

public class BuildMessage {
    public static String input(String methodName, String methodGreet) {
        return methodName + methodGreet;
    }

    public static void main(String[] args) {
        System.out.println(input("田中さん", "、いい朝ですね。"));
        System.out.println(input("鈴木さん", "、お元気ですか。"));
        System.out.println(input("佐藤さん", "、ようこそ。"));

    }
}
