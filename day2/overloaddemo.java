// main method can be overloded
public class overloaddemo {
    public static void main() {
        System.out.println("main with zero argument");
    }

    public static void main(int a) {
        System.out.println("main with one argument" + a);
    }

    public static void main(int a, int b) {
        System.out.println("main with two argument" + a + b);
    }

    public static void main(String[] args) {
        main();
        main(5);
        main(4, 6);
    }
}
