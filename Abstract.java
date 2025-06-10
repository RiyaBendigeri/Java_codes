 abstract class  Base {

    Base()
    {
        System.out.println("i m base");
    }
    abstract public void greet();

}
class Derive extends Base{
    public void greet()
    {
        System.out.println("helllo");
    }
}
public class Abstract {
    public static void main(String[] args) {
         /*Derive obj=new Derive();
    obj.greet();*/
    Base obj = new Derived();
    obj.greet();
    /*Base b=new Base();
    b.greet(); u cannot do this beacuse the base is an abstract class */
    }
   
}
