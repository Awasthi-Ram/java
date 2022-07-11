public class final2 {
    public static void main(String[] args) {
        honda obj = new honda();
    }
}

class bike4 {
    final void run() {
        System.out.println("running");
    }
}

class honda extends bike4 {
    void run() {
        System.out.println("running honda bike");
    }
}
