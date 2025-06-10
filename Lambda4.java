interface calculator{
    Calc getmsg(String msg);
}
class Calc{
    Calc(String msg)
    {
        System.out.println(msg);
    }
}
public class Lambda4 {
    public static void main(String[] args) {
        calculator obj = Calc::new;
        obj.getmsg("hello world");  
    }
}
//method reference to a constructor