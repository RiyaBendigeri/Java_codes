class Base{
    Base(){
        System.out.println("i m base class");
    }
    public void greet()
    {
        System.out.println("i m base class method");
    }
    public void play()
    {
        System.out.println("we r  playing");
    }


}
class Derived extends Base{
   Derived(){
        System.out.println("i m derived class");
    }
    public void greet()
    {
        System.out.println("i m derive class method");
    }
    public void music()
    {
        System.out.println("i m derived class music");
    }
}
public class DynamicDispatch {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.greet();
        obj.play();
        //obj.music();//this will give error because u cant access derive methods having ref of base
    }
    
}
