import java.util.LinkedHashSet;

// store null value allso
// maintain insertion order
public class linked_hashset {
    public static void main(String[] args) {
        LinkedHashSet it = new LinkedHashSet();
        it.add("ram");
        it.add("mohit");
        it.add("palak");
        it.add("balram");
        it.add("sham");
        it.add(47);
        it.add(7541);
        it.add(null);

        for (Object i : it) {
            System.out.println(i);
        }
        LinkedHashSet<Integer> it1 = new LinkedHashSet<Integer>();
        /*
         * it.add("ram");
         * it.add("mohit");
         * it.add("palak");
         * it.add("balram");
         * it.add("sham");
         */
        it.add(47);
        it.add(7541);

        for (int i : it1) {
            System.out.println(i);
        }

    }
}
