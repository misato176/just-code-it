package ex030904;

public class ReplaceExample {
    public static void main(String[] args) {
        String a = "サクサクのクッキー";
        String after = a.replaceAll("サ", "a").replaceAll("キ", "サ").replaceAll("a", "キ");
        System.out.println(a);
        System.out.println(after);
    }
}
