public class interface1 {
    public static void main(String[] args) {
        impl3 t = new impl3();
        t.studentDetails(457, "ram");
        t.facultyDetails(741, "vijay");
        t.exam("java");
        result t2 = new impl3();
        // t2.studentDetails(457, "ram");
        // t2.facultyDetails(741, "vijay");
        t2.exam("java");
    }
}

interface college {
    // int a ; not a allow
    int a = 10;

    // it is treated as final and static
    void studentDetails(int rollno, String name);

    void facultyDetails(int empid, String name);
}

interface result /* extends college */ {
    void exam(String subject);
}

interface interface_inherit extends college {

}

class impl3 implements college, result {
    @Override
    public void studentDetails(int rollno, String name) {
        System.out.println("rollno = " + rollno + "name  " + name);
    }

    @Override
    public void facultyDetails(int empid, String name) {
        System.out.println("empId = " + empid + "name  " + name);
    }

    @Override
    public void exam(String subject) {
        System.out.println("name of subject  " + subject);
    }

    public void display() {
        System.out.println("hello");
    }

}
