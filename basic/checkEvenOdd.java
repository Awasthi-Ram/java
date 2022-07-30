package basic;
import java.util.Scanner;
public class checkEvenOdd {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter a no.");
        int a = input.nextInt();
        if (a%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odds");
        }

    }
}
