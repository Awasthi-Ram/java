import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import org.xml.sax.InputSource;

/**
 * @author ram awasthi
 * @version 17.24
 * @see <a href=
 *      "https://docs.oracle.com/en/java/javase/18/docs/api/index.html">javadoc</a>
 * @since 26-07-2022
 **/
// sorted insertion
public class treemap {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(7485, "ram");
        tm.put(745, "thinking");
        tm.put(485, "about ");
        tm.put(75, "some");
        tm.put(5, "one");

        System.out.println(tm);

        tm.putIfAbsent(745, "new value");// new value is put if key is not present
        // teverse of map
        for (Map.Entry m : tm.entrySet()) {
            System.out.println(m.getKey() + "  " + m.getValue());
        }
        InputSource h1 = new InputSource();
        InputStream h;
        // h.read("ram");
        OutputStream f;
    }
}
