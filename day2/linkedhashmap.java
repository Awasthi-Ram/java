import java.util.Iterator;
import java.util.LinkedHashMap;

// order maintain
public class linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(7485, "ram");
        lhm.put(745, "loves");
        lhm.put(485, "palak");
        lhm.put(75, "sharm");
        lhm.put(5, "so much");

        System.out.println(lhm);
        lhm.putIfAbsent("745", "new value");// new value is put if key is not present

        // Iterator it = lhm.iterator();// not work

        /*
         * for (Object i : lhm) {
         * 
         * }
         */

    }
}
