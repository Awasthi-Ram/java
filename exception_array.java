public class exception_array {
    public static void main(String[] args) {
        int a[]=new int [5];
        try{
            a[0]= 20;
            a[45] =12;
            a[2014]= 457;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("hello");
    }
}
