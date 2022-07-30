class demo {
    int rollno;

    static String clg = "global";

    public demo(int a) {
        rollno = a;
        System.out.println(rollno + "  " + clg);
    }

    public demo() {
    }
}

public class staic_cont {
    public static void main(String[] args) {
        demo obj1 = new demo();
        demo obj2 = new demo(4);
        demo obj3 = new demo(5);

    }
}
