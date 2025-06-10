interface Hello{
    public void greet();
    public void notice();
    default  void play()
    {
        System.out.println("i m playing");
    }
}
interface Bye{
    int a=10000;
    void run();
    void walk();
}
class A implements Hello,Bye{
    int a=9;//if i print a now it gives me 9
    public void notice()
    {
        System.out.println("hello i m notice");
    }
    public void greet()
    {
        System.out.println("hello i m greet");
    }
    public void run()
    {
        System.out.println("u cna run");
    }
    public void walk()
    {
        System.out.println("u can walk");
    }
    // public void play()
    // {
    //     System.out.println("i m not playing ");
    // } if  i write this method then this will be overriden 
}
public class Interface {
    public static void main(String[] args) {
        A obj = new A();
         obj.play();
    obj.greet();
    obj.notice();
    obj.run();
    obj.walk();//here from 2 or more interfaces u have implemented this

    System.out.println(obj.a);//u can create properties in interface and access it here
       // obj.a=90 this will give error u cannot modify the properties 
    }
   
    
}
