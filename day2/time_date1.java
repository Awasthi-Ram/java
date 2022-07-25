public class time_date1 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() / 1000);
        System.out.println(System.currentTimeMillis() / 1000 / 3600);
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24);
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365.25);
    }
}
