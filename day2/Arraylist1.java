import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(); // ---- with out generic all data type supported
        Collection<Integer> alcolletion = new ArrayList<Integer>(); // ---- with out generic all data type supported
        al.add(41);
        al.add(2);
        al.add("ram");
        al.add(38);
        al.add("mohit");
        al.add("IT");
        al.add(6, "element");
        al.add(2, "element_add");
        al.add(4, "moving shifting");// can allso be use to shif the element
        al.set(1, "set replace");// only use to replace the element
        // two way to asses this array list itertar interface
        Iterator itr = al.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());

        al.remove(2);
        al.remove("ram");
        // al.clear();
        // space

        System.out.println(al.get(2));
        System.out.println("size of arraylist " + al.size());
        for (Object a : al) {
            System.out.println(a);
        }
        // in removing index has higest prority than object
        // al.remove("ram");

        // with generic -----------
        // fource collection to store specific type of element
        // with data type -
        ArrayList<Integer> alint = new ArrayList<Integer>(); // ---- with out generic all data type supported
        alint.add(0);
        alint.add(4);
        alint.add(7);
        alint.add(77);
        alint.add(67);
        alint.add(17);
        alint.add(27);
        alint.add(40);

        al.addAll(alint);
        al.addAll(2, alint);

        // contains is only use to check wheather a list is containing A OBJ OR ELEMENT
        // OR NOT
        System.out.println("contains     " + al.contains("palak"));

        for (Object a : alint) {
            System.out.println(a);
        }

        // genic to its own class
        ArrayList<ArrayList> ob = new ArrayList<ArrayList>();
        ob.add(al);
        ob.add(alint);// we can only add Arratlist ;

    }

}