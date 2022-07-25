import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class retain {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("ram");
        hs.add("vijay");
        hs.add("palak");

        ArrayList ls = new ArrayList();
        ls.add("ram");
        ls.add("vijay");
        ls.add("arpita");
        System.out.println(hs);
        System.out.println(ls);
        ls.retainAll(hs);// ls will contain only element which is present in hs comonlly
        System.out.println(hs);
        System.out.println(ls);
        Iterator it = ls.iterator();
    }
}
