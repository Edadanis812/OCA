package Q2;

public class App {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = (j +=i) / 5;		// k = 30/5 =6
        //j=(j+i)/5=30/5=6
        // (j = j+i) = (j = 30)  in parentheses j is equalized to 30
        System.out.print(i + " : " + j + " : " + k);
    }
}
/*CEVAP: A
What is the result?
A. 10 : 30 : 6
B. 10 : 22 : 22
C. 10 : 22 : 20
D. 10 : 22 : 6
 */
