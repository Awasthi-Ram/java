import java.util.*;
//import java.util.LinkedList;

public class linklist {
    public static void main(String[] args) {
        // it use doubly linklist
        // linklist linkme = new linklist();
        LinkedList<String> linkedme = new LinkedList<String>();
        LinkedList ad = new LinkedList();
        linkedme.add("ram");
        linkedme.add("vijay");
        linkedme.add("vinay");
        linkedme.add("mohan");
        linkedme.add("rahul");
        linkedme.add("global");
        linkedme.add("muskhan");
        linkedme.addLast("jabalpur");
        for (Object a : linkedme) {
            System.out.println(a);
        }
        System.out.println("head element " + linkedme.peek());
        List new_list = linkedme.subList(3, 6);// to divide the list or create a new list from old list
        System.out.println("new list");

        for (Object a : linkedme) {
            System.out.println(a);
        }
    }
}
