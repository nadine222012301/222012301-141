class A extends B implements E{
    int Add(int y,int x){
        return y+x;
    }
    public double power(double x,double y){
        return Math.pow(x, y);
    }
}
class B extends C{
    int sub(int x, int y){
        return x-y;
    }
}
class C extends D {
    double division(double x, double y){
        return x/y;
    }
}
class D{
  int multiply(int x,int y){
    return x*y;
  }
}
interface E{
  double power(double x,double y);
  } 

public class inheritancework {
public static void main(String[]args){
 A Obj = new A();
 System.out.println("adding two numbers:"+ " "+Obj.Add(4, 9));
 System.out.println();
 System.out.println("productof getting subtraction:"+ " "+Obj.sub(9, 21));
 System.out.println("product of getting division:"+ " "+Obj.division(18,9));
 System.out.println("product of geting power:"+" "+Obj.power(4, 6));
}
}/**
   output:
   adding two numbers: 13

productof getting subtraction: -12
product of getting division: 2.0
product of geting power: 4096.0 
     
 */