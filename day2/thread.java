public class thread {
    public static void main(String[] args) {
        th obj1 = new th();
        th1 obj2 = new th1();
        Thread a = new Thread(obj1);
        Thread b = new Thread(obj2);
        a.start();
        b.start();
        obj1.run();
        obj2.run();

    }
}

class th implements Runnable {
    public th() {
        super("thread 1");
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 45) {
            System.out.println("th1");
            i++;

        }
    }
}

class th1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 45) {
            System.out.println("th second");
            i++;

        }
    }
}
