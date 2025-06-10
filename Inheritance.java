class Base{

     int x;
     Base()
     {
        System.out.println("i m base class constrcutor");
     }
    public void getID(int id)

    {
        this.x=id;    
        System.out.println("i m in base class"+x);
    }
    public void putmsg()
    {
        System.out.println("i m in base class putmsg");
    }
}
class Derive extends Base{
    int y;
    Derive()
    {
        System.out.println("I m derived class constrcutor");
    }
    Derive(int y)
    {
        this.y=y;
        System.out.println("value of y is"+y);
    }
    public void getName( )
    {
        System.out.println("my name is kohli");
    }
    public void setValue(int k)
    {
        this.y=k;
    }
    public void putmsg()
    {
       // super.putmsg();
        System.out.println("i m putmsg but from dervied");
    }
    public void display()
    {
        putmsg();
        super.putmsg();
    }
}
class Derive2 extends Derive{
    
    Derive2()
    {
        super(7);
        
        System.out.println("i m derived->derived");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Derive2 obj = new Derive2();
        obj.getName();
        Derive object=new Derive();
        object.putmsg();
        object.display();
    }
}
