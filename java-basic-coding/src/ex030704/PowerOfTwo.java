package ex030704;

public class PowerOfTwo {

    public static final int digit_limit(10); 

    public static void main(String[] args) {
        // int a = 2; 
        // int n = 10000; 
        // int ans = 1;
        // for (int i = 1; i <= n; i++) {
        //     ans *= a;

        //     if (ans >= 1000000000) {
        //         break;
        //     };
        //     System.out.println(ans);

        // } //ループ数に上限は設けないようにする。

        int result = 2;

        while ( result < 1_000_000_000) {
            System.out.println( result );
            result *= 2;

        }//上限を1_000_000_000になる前と固定した場合。



        
    }
       
}//繰り返しの条件付けの方法をいくつか考えてみるのがいいかも
//forで条件を十分に満たす回数だけ繰り返すことを指定してifで終了条件を改めて提示する。
//べき乗の記述方法ans *= aとしているが中身はans * a の結果を再度ansに代入するというもの。
//後ほど、whileバージョンとBigdecimalを使用したバージョンで考えてみる