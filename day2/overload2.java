public class overload2 {
    public static void main(String[] args) {
        demo4 obj = new demo4();
        obj.sum(4, 5);
        obj.sum(40, 9);
        obj.sum(40l, 9l);
    }
}

class demo4 {
    void sum(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    void sum(long a, long b) {
        long c = a * b;
        System.out.println(c);
    }
}
