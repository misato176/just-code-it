package ex030403;

public class StringLength {
    public static void main(String[] args) {
        String text1 = ("1234567890");//文字列を代入
        int count1 = text1.length();
        System.out.println("文字数は" + count1 + "文字です。");


        String text2 = ("１２３４５６７８９０");
        int count2 = text2.length();
        System.out.println("文字数は" + count2 + "文字です。");

        String text3    = ("飛べない豚は、ただの豚だ。");
        int count3 = text3.length();
        System.out.println("文字数は" + count3 + "文字です。");


    }
}
