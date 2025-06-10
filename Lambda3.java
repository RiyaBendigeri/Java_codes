interface calculator{
    void add(int n1,int n2);
}
class Calc{
    public  void func(int n1,int n2)
    {
        System.out.println(n1+n2);
    }
}
public class Lambda3 {
    public static void main(String[] args) {
        
    
    Calc obj = new Calc();
    calculator obj2 = obj::func;
    obj2.add(2,3);
    }
}
//reference to non static method / instance method 