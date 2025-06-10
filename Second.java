 class Myemployee{
    private int id;
    private String name;
    public Myemployee()
    {
        System.out.println("in default constructor");
        id=3;
        name="viratkohli";
    }
    public Myemployee(int id,String name)
    {
       this.id=id;
       this.name=name;
    }
    public void getID()
    {
        System.out.println("id:"+id);

    }
    public void setID(int id)
    {
        this.id=id;
    }
    public void getName()
    {
        System.out.println(name);
    }

}
public class Second {
    public static void main(String[] args)
    {
        Myemployee onj2 = new Myemployee();
        onj2.getID();
        Myemployee obj = new Myemployee(1,"riya");
       // obj.setID(1);
        obj.getName();
        obj.getID();    
    }
}
