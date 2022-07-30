//package basic;
class calculation {

    int area(int a, int b) {
        return a * b / 2;
    }

    // default constructer
    calculation() {
        System.out.println("default constructer called");
    }

    // parameterrised constructer
    calculation(String name) {
        System.out.println("parameterised construter");
    }

    calculation(int num) {
        System.out.println("parameterised int construter");
    }

    calculation(float num) {
        System.out.println("parameterised float construter");
    }
}

public class demoObject {

    public static void main(String[] args) {
        calculation obj = new calculation();
        calculation obj1 = new calculation("world");
        calculation obj2 = new calculation(5);
        calculation obj3 = new calculation(5.2f);
        new calculation();
        new calculation("world");
        new calculation(5);
        new calculation(5.2f);

    }
}
