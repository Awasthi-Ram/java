import java.lang.*;
import java.util.*;

public class reading {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        System.out.println("enter two no.");
        a = s.nextInt();
        b = s.nextInt();

        c = a + b;
        System.out.println("the sum of two no. is" + c);

    }
}