import java.util.Iterator;
import java.util.TreeSet;

// make it sorted the unsorder inserted element
public class treeset {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(10);
        ts.add(20);
        ts.add(300);
        ts.add(400);
        ts.add(50);
        ts.add(60);

        System.out.println("without loop " + ts);
        for (Object iterable_element : ts) {
            System.out.println(ts);
        }

        // as asses each element of an array
        Iterator ch = ts.iterator();
        while (ch.hasNext()) {
            System.out.println(ch.next());
        }
        System.out.println(ts.pollFirst());// asses frist element than delete it
        System.out.println(ts.pollLast());// asses last element than delete that element
        while (ch.hasNext()) {
            System.out.println(ch.next());
        }

    }
}
