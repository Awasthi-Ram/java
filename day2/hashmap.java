import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap la = new HashMap();
        la.put(8, "hahaha");
        la.put(78, "c");
        la.put(42, "phython");
        la.put(2, "java");
        la.put(71, "javascript");
        la.put(021.3, "c++");
        la.put("key can", "be string");// keys can de of any data type
        la.put(2, "not uniq");// over write the ke value

        System.out.println(la);

        System.out.println(la.get(42));// gave value of gaven key

        System.out.println(la.keySet());// gave all the keys

        System.out.println(la.values());// gave values of all the keys

        System.out.println(la.replace("key can", " new value replaced"));// to replace the value
        // allso return the previous value or return old value
        System.out.println(la.values());// gave values of all the keys

        if (la.containsKey(78))// return true if key present and false if not present
        {
            System.out.println("present");
        } else {
            System.out.println("not present");
        }
        System.out.println(la.containsValue("java"));// return true if value find and false value not found
        System.out.println(la.size());// return size of an hashmap
        System.out.println(la.hashCode());// gave hash code of that hash map

    }
}
