// blank final variable;
public class final3 {
    public static void main(String[] args) {
        bike10 obj = new bike10();
        System.out.println(bike10.data);
    }
}

class bike10 {
    final int speed;
    public final static int data;// final satatic variable;

    bike10() {
        speed = 40;
        // data =74;
        System.out.println("speed " + speed);
    }

    static {
        data = 50;
    }
}
