package Q15_ONEMLI;

public class Q15 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        System.out.println(str1);
        /* insert code here*/
//        String str2 = "Duke"; == ISARETININ KONTROLU VARDIR. BU DEGER KONTROL ETMEZ. OBJECTLERIN ADRESLERINI KONTROL EDER.
        String str2 = sb1.toString();// BURADA DA VALUE KONTROLU VARDIR.
//        String str2 = str1; // the objects are equalized
        System.out.println(str1 == str2); // == checks if the objects are equal, not their values
    }
}//CEVAP:A
// Which code fragment, when inserted at line 9, enables the code to print true?
//A.	String str2 = str1;
//B.	String str2 = new String(str1); bu degil
//C.	String str2 = sb1.toString();
//D.	String str2 = "Duke";

