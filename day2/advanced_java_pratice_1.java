import java.util.ArrayList;

public class advanced_java_pratice_1 {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add("ram");
        ar.add("shaym");
        ar.add("mohal");
        ar.add("nirmala");
        ar.add("rohit");

        for (Object object : ar) {
            System.out.println(object);
        }

    }
}
