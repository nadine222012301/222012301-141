class A extends B implements E{
     void geta(){
        System.out.println("this is class A");
     }
     public void gete(){
        System.out.println("this is an interface E");
     }
}
class B extends C{
    int getb(){
        return 3+8;
     }
}
class C extends D{
    void getc(){
        System.out.println("this is class C");
     }
}
class D{
    void getd(){
        System.out.println("this is class D");
     }
}
interface E{
     void gete();
}
public class inheritance2 {
    public static void main(String[] args) {
        A a = new A();
        a.geta();
        System.out.println(a.getb());
        a.getc();
        a.getd();
        a.gete();
    }
    
}

/*
 * 
  Output
this is class A
this is class B
this is class C
this is class D
this is an interface E
 */