// final keyword
class bike_hero {
    final int speed = 60;

    void run() {
        speed = 78;
    }
}

public class final1 {
    public static void main(String[] args) {
        bike_hero obj = new bike_hero();
        obj.run();
        ;
    }
}
