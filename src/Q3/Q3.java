package Q3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q3 {
        public static void main(String[] args) {
            String date = LocalDate
                    .parse("2016-11-01")// time is not assigned here
                    .format(DateTimeFormatter.ISO_DATE_TIME);  	//_TIME should be removed
            //format(DateTimeFormatter.ISO_DATE); ->BOYLE OLSAYDI CIKTIMIZ "2016-11-01" BU OLACAKTI.
            System.out.println(date);
        }

       //BIZE BURADA HERHANGI BIR SAAAT BELIRTILMEDIGI ICIN EXCEPTION OLUSUR
        //DateTimeFormatter	Formatter for displaying and parsing date-time objects
    //BU SORUYA BAKTIGIMIZDA PARSE ICINDE SADECE DATE BELIRTILMISTIR.
    //FORMAT ISTENILDIGINDE DATE VE TIME BELIRTILMIS. BU YUZDEN BU SORUDA UNSUPPORTEDTEMPORALEXCEPTION ALIRIZ.
    /*
What is the result?
A. May 04, 2014T00:00:00.000
B. 2014-05-04T00:00: 00.000
C. 5/4/14T00:00:00.000
D. An exception is thrown at runtime.
Answer: D
*/

}
