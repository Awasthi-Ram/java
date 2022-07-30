import java.util.ArrayList;

public class generic {
    public static void main(String[] args) {
        // raw type array list
        ArrayList al = new ArrayList();
        al.add(47);
        al.add(47);
        al.add("94");
        al.add(45.34f);
        al.add("ram");

        // int a = al.get(7);
        int a = (int) al.get(1);
        System.out.println(a);

        my_generic<String> g1 = new my_generic(23, "String");
        String b = g1.getT1();
        System.out.println(b);
    }
}

class my_generic<T1> {
    int val = 344;
    private T1 t1;

    public my_generic(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

}
