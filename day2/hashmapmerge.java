import java.util.HashMap;

public class hashmapmerge {
    public static void main(String[] args) {
        HashMap<Integer, String> l2 = new HashMap<Integer, String>();
        l2.put(78, "ram");
        l2.put(8, "shayam");
        l2.put(478, "mohan");
        l2.put(778, "adithya");
        l2.put(789, "nirmala");
        l2.put(718, "rahul");

        System.out.println(l2);

        // int value_merge =
        l2.merge(7891, "palak", null);// 1
    }
}
