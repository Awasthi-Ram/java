// variable hidding
class A {
    int a = 10;
}

class B extends A {
    int a = 200;

    void show() {
        System.out.println("value of a :" + a);
        System.out.println("value of a :" + super.a);
    }
}

public class varhid {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
