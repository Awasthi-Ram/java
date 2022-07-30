import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.jcp.xml.dsig.internal.SignerOutputStream;

/*  Create a library management system that is capable of issuing books to the students. Every book should have info like:
        1. Book name
        2. Book Author
        3. Issued to
        4. Issued on
Users should be able to add books, return issued books, issue books. Assume that all the users are registered with their names in the central database.
*/
public class library {
    public static void main(String[] args) throws IOException {
        File Student = new File("library/Student.txt");
        Student.createNewFile();
        FileWriter fw = new FileWriter("library/Student.txt");
        boolean ut = true;
        Scanner sc = new Scanner(System.in);
        String stu_name = "no";
        while (!stu_name.isBlank()) {
            System.out.println("enter student name");
            System.out.println("just press enter if you Do'nt want to store more names in data base");
            stu_name = sc.nextLine();
            fw.write(stu_name);
            fw.write("\n");
        }
        fw.close();
        Scanner read = new Scanner(Student);
        System.out.println("enter name of student");
        String name = sc.nextLine();
        FileReader fr = null;
        while (read.hasNextLine()) {
            BufferedReader br = new BufferedReader(fr);
            boolean count = read.equals("ram");
            read.
            if (read.nextLine() == name) {
                System.out.println("enter I if you want to issue or enter R if you want to return");
                char request = sc.next().charAt(0);
                switch (request) {
                    case 'I':
                        System.out.println(" enter book name and author name ");
                        String a, b;
                        a = sc.nextLine();
                        b = sc.nextLine();
                        book Book = new book(a,b);
                        FileWriter record = new FileWriter("library/Student.txt");
                        record.write(book.toString(), off, len);
                    
                        ArrayList<book> ar = new ArrayList<>();
                        ar.add(Book);
                        MYlibrary is = new MYlibrary(ar);
                        break;

                    default:
                        break;
                }
            } else {
                System.out.println("student not found in data base");
            }
        }

    }

    /*
     * while(read.hasNextLine()){
     * System.out.println("enter student name ");
     * String name = sc.nextLine();
     * if(read.findAll(name))
     * }
     * ArrayList<book> bk = new ArrayList<>();
     * System.out.println(" enter book name and author name ");
     * String a, b;
     * a = sc.nextLine();
     * b = sc.nextLine();
     * bk.add(new book(a, b));
     * MYlibrary l = new MYlibrary(bk);
     * l.addBook(new book("DBMS", "author"));
     * System.out.println(l.book);
     * l.issueBook(bk, "ram awasthi");
     * }
     * }
     */
    class book {
        public String name, author;

        public book(String name, String author) {
            this.name = name;
            this.author = author;
        }

        @Override
        public static String toString() {

            return "book{" + "name= ' " + name + '\'' + ", author ='' " + author + '\'' + '}';
        }
    }

    class MYlibrary {
        public ArrayList<book> book;

        public MYlibrary(ArrayList<book> book) {
            this.book = book;
        }

        public void addBook(book book) {
            this.book.add(book);
        }

        public void issueBook(book book, String issused_to) {
            System.out.println(" this book has been issused from the library  " +
                    issused_to);
            this.book.remove(book);
        }

        public void returnBook(book book) {
            System.out.println("this book is returned");
            this.book.add(book);
        }
    }

  class library_managment {
  private String book;
 }