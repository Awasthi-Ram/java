class rectangle {
    rectangle(int i, int j) {
        int ar = i * j;
        System.out.println("area of rectangle" + ar);
    }
}

class circle extends rectangle {

    circle(int r) {
        super(10, 4);
        double ar = 3.141 * r * r;
        System.out.println("area of circle" + ar);
    }
}

public class supercont {
    public static void main(String[] args) {
        int r = 5;
        circle obj = new circle(r);
    }
}
