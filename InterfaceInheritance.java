interface A {
    void display();
    void read();
}
interface B extends A{
    void hello();
    void bye();
}
class C implements B{
    public void hello()
    {
        System.out.println("this is hello");
    }
    public void bye()
    {
        System.out.println("this is bye");
    }
    public void display()
    {
        System.out.println("this is display");
    }
    public void read()
    {
        System.out.println("this is read");
    }
}
public class InterfaceInheritance {
    public static void main(String[] args) {
        C obj = new C();
    obj.hello();
    }
    
}
