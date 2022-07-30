import javax.sound.sampled.SourceDataLine;

@FunctionalInterface
interface demoano1 {
    void labda();
}

interface demoano {
    void meth1();

    void meth2();
}

/*
 * class anonydemo implements demoano {
 * public void display() {
 * System.out.println("hello world");
 * }
 * 
 * @Override
 * public void meth1() {
 * System.out.println("i am meth1");
 * }
 * 
 * @Override
 * public void meth2() {
 * System.out.println("i am meth 2");
 * }
 * }
 */

public class lambda_expression {

    public static void main(String[] args) {
        /*
         * anonydemo obj = new anonydemo();
         * obj.meth1();
         * obj.meth2();
         */
        // by using annomynimus class
        /*
         * demoano obj2 = new demoano() {
         * 
         * @Override
         * public void meth1() {
         * System.out.println("i am meth1 by annonynimus class");
         * }
         * 
         * @Override
         * public void meth2() {
         * System.out.println("i am meth 2 annonymus class");
         * }
         * };
         * obj2.meth1();
         * // obj2.meth2();
         */
        // lambda expression not using by creating vlass and implementation of interface
        // use to creat object of interface of one method without using class

        demoano1 obj3 = () -> {
            System.out.println("i am meth of lambda expression one ");
        };

        obj3.labda();
    }
}
