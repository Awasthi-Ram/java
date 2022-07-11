
public class instancedemo1 {
    public static void main(String[] args) {
        new bike();
        bike obj = new bike();
    }
}

class bike {
    int speed;

    bike() {
        System.out.println("speed is : " + speed);
    }

    {
        speed = 100;
    }
}
