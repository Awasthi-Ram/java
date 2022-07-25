import java.util.*;

class bidd {
    public static int input() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        return a;
    }

    public static void main(String[] args) {

        System.out.println("bid of charlie");
        int a, b, c;
        a = input();
        b = input();
        c = input();
        if (a > b && a > c) {
            System.out.println("Charlie will win the auction");
        }
        if (b > a && b > c) {
            System.out.println("Alice, Bob will win the auction");
        }
        if (c > a && c > b) {
            System.out.println(" Bob will win the auction.");
        }
    }
}