public class abstractclass {
    public static void main(String[] args) {
        Impl obj = new Impl();
        obj.area_of_circle(5);
        obj.area_of_rectangle(6, 10);
    }
}

abstract class area {
    void area_of_rectangle(int l, int w) {
        int ar = l * w;
        System.out.println(ar);
    }

    abstract void area_of_circle(int r);

}

class Impl extends area {

    void area_of_circle(int r) {
        double ar2 = 3.141 * r * r;
        System.out.println(ar2);
    }
}
