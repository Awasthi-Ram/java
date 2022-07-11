import java.util.*;

class b {
    int mul(int a, int b) {
        return a * b;
    }
}

class c extends b {
    int mul(int a, int b) {
        super.mul(a, b);
        return a + b;
    }
}

class a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        c obj = new C();
        System.out.println(obj.mul(4, 5));
        System.out.println(obj.mul(4, 5));
        b obj1 = new b();
        System.out.println(obj1.mul(4, 5));
        b obj2 = new c();
        System.out.println(obj1.mul(4, 5));
    }
}