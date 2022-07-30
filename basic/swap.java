package basic;

import java.util.Scanner;

public class swap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter frist no.");
        int a = input.nextInt();
        System.out.println("enter second no.");
        int b = input.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("value of a %d value of b %d", a, b);
    }
}
