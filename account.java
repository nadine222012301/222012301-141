public class account{
int year;
double rate;
long principle;

void getamount(int y,double r,long p)
    {
year= y;
rate=r;
principle=p;
}
void calculation()
{
    double interet=year*principle*rate;
    System.out.println(interet);
}
public static void main(String[] args) {
    account s=new account();
    s.getamount(5,0.05,100000);
    s.calculation();
}
}
