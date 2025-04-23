package ex030903;

public class TrimExample {
    public static void main(String[] args) {
        String str1 = "   panda";
        String str2 = " pan da ";
        String str3 = "panda   ";

        String result1 = str1.trim();
        String result2 = str2.trim();
        String result3 = str3.trim();

        System.out.println( result1 );
        System.out.println( result2 );
        System.out.println( result3 );

    }
}
