package Q2;

public class App2 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = j += i / 5 ;
        // k = j = j + i / 5 ==> first i / 5 = 2, then k = j = j + 2 => 22
        System.out.println(i + " : " + j + " : " + k);
    }
}
