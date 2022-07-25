import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import org.xml.sax.InputSource;

// sorted insertion
public class treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(7485, "ram");
        tm.put(745, "loves");
        tm.put(485, "palak");
        tm.put(75, "sharm");
        tm.put(5, "so much");

        System.out.println(tm);

        tm.putIfAbsent(745, "new value");// new value is put if key is not present
        // teverse of map
        for (Map.Entry m : tm.entrySet()) {
            System.out.println(m.getKey() + "  " + m.getValue());
        }
        InputSource h1 = new InputSource();
        InputStream h ;
       // h.read("ram");
        OutputStream f ;
    }
}
