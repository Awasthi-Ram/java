
// uniqe element 
// use hash table
// no dublicate values
import java.util.*;

public class hashsetclass {
    public static void main(String[] args) {
        // with-out generic
        HashSet ht = new HashSet();
        ht.add("one");
        ht.add("two");
        ht.add(3);
        ht.add(4);
        ht.add("five");
        ht.add("five");// same element inserion not allowed
        ht.add("five");// same element insertion not allowed

        for (Object object : ht) {
            System.out.println(object);
        }
        System.out.println(ht.contains("five"));
        // ht.forEach(Object i: ht);
        System.out.println("hashsetclass.main()" + ht.hashCode());
        System.out.println(ht.hashCode());
        ht.notifyAll();
        ht.spliterator();
        ht.parallelStream();

        // convertion from one type object to another type object
        ArrayList ls = new ArrayList(ht);
        ls.add(475612);
        ls.add(612);
        linked_hashset it = new linked_hashset();
        for (Collection obj : linked_hashset.it) {
            System.out.println(ht.retainAll(obj));
        }

    }
}
