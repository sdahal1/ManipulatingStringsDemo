public class StringManipulatorTest {
    public static void main(String[] args){
        StringManipulator s1 = new StringManipulator();
        // s1.helloWorld();
        // s1.helloWorld("Lebron");
        // System.out.println(s1.trimAndConcat("       robinhood   ", " please stop     "));
        // s1.trimAndConcat("       robinhood   ", " please stop     ");
        //the value of a function call is whatever that function call returns


        // System.out.println(s1.getIndexOrNull("Calamari", 'x'));
        // System.out.println(s1.getIndexOrNull("GonzagaOwesMeBitcoin", 'B'));
        // System.out.println(s1.getIndexOrNull("KanyeForPresident", "Prez"));
        // System.out.println(s1.getIndexOrNull("Calamari", 'x'));
        s1.concatSubstring("Garfield", 2,6, "whaaaaaazaapp");
        s1.concatSubstring("Younggmulalaaa babayyy", 3,10, "ya dig!");

        // s1.getIndexOrNull("Calamari", 'x');
    }
}