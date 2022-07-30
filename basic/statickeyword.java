class counter {
    // int count;
    static int count;
    // staic gave single memory to the variable;

    counter() {
        count++;
        System.out.println(count);
    }
}

public class statickeyword {
    public static void main(String[] args) {
        new counter();
        new counter();
        new counter();
        new counter();
    }
}
