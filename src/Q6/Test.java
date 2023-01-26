package Q6;

//class X{
//    public void printFileContent() throws IOException {
//        /*code goes here */
//        throw new IOException();
//        //-THROW KULLANILDIGINDA TEKRAR HANDLE ETMELIYIZ. THROWS ILE BU DURUMU BELIRTMEMIZ GEREKIR KULLANACAGIZ METHODDA.
//    }
//}
//public class Test {
//    public static void main(String[] args) throws IOException {
//        X xobj = new X();
//        xobj.printFileContent();
//    }

    /* CEVAP:CE=>  public void printFileContent() throws IOException VE public static void main(String[] args) throws IOException  EKLEMEKTIR.
    A. Option A
B. Option B
C. Option C
D. Option D
E. Option E
     */

//A SIKKI: try cath yaptigimizda. child ve parent iliskisi vardir.
//NOTE: FileNotFoundException is a child of IOException so its catch block must come first.
//      Exception is parent of IOException.Child needs to write at first.Bu yuzden A yi eleriz. Parent ilk yazilmiz.
//B SIKKI:
//C SIKKI: main de throws key word u  koy
//D SIKKI:
//E SIKKI:
//CEVAP: CE

//}
