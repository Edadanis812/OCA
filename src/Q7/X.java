package Q7;

public class X {

    //BU SORUDA i DEGERI STATICTIR. O YUZDEN NE OLURSA OLSUN EN SON ALDIGI DEGER GECERLI OLACAKTIR.
    //i degerinin ilk degeri 3 son degeride 5 o yuzden print ettirirken son degeri olan 5 degerini x1 ve x2 icin print ettirir.
    static int i;  // static fields gets changed for every object
    int j;
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new X();
        x1.i= 3;
        x1.j = 4;
        x2.i= 5;
        x2.j = 6;
        System.out.println(
                x1.i + " " +
                        x1.j + " " +
                        x2.i + " " +
                        x2.j);
    }
    //STATIC EN SON DEGERI ALIR VE TUTAR.
    //CEVAP:5456
}