interface calculator{
    void add(int n1,int n2);
}
class Calc{
    public static void func(int n1,int n2)
    {
        System.out.println(n1+n2);
    }
}
public class Lambda2 {
    public static void main(String[] args) {
        calculator obj = Calc::func;
        obj.add(2,3);
    }
}
//reference to static method