class base{
   private String name;
   private  int rollno ;
   String get(){
     return name;
   }
   int get_roll(){
     return rollno;
   }
   void set (String name ,int rollno){
    this.name = name;
    this.rollno =rollno;
   }
}
class derived extends base{
        void print(){
            System.out.println(get()+" "+get_roll());
        }
}

public class inheritance {+
    public static void main(String[] args) {
        derived obj = new derived();
        obj.print();
    }
}
