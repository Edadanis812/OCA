package Q1;

public class Test {


        public static void main(String[] args) {
            int x = 1;
            int y = 1;
            if (x++ < ++y) { // x is still 1,   y is 2 ==> true
                //Buraya geldigimde x=1 y=2 dogru ife girer.
                //bu if bitince x artis olur sonradan
                System.out.print("Hello ");
            }else {
                System.out.print("Welcome ");
            }
            System.out.print("Log " + x + ":" + y);  // x ix used again so x becomes 2
        }
        /* CEVAP A
        What is the result?
A. Hello
Log 2:2
B. Welcome
Log 1:2
C. Welcome
Log 2:1
D. Hello
Log 1:2
         */

}
