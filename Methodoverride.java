 class A{
     int a;
    A()
    {
        System.out.println("this is default constrcutor of A");
    }
     A(int a)
    {
        this.a=a;
        System.out.println("value of a is "+a);
    }
    public void math()//heere if u write public static or public final then u get error
    {
        System.out.println("i m math of base class");
    }
}

class B extends  A{
     B()
    {
        
        System.out.println("i m idefault constrcutor of derived class");
    }
    public void math()//if u make this private or protected u cannot access the method 
    {
        System.out.println("i m  math of derived class");
    }
}

public class Methodoverride {
    public static void main(String[] args) {
         B obj= new B();
    obj.math();
    }
   
}
