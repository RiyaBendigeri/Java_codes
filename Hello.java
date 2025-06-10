 //but mi access ka nahi dila yat?
//default private asto
 class Employee{

     int id;//priavte kela tar accessible nahi honar
     String name;
    Employee(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public void printname()
    {
        System.out.println(name);
        System.out.println(id);
    }

}
class hello{

    public static void main(String []args)
    {
        System.out.println(9);
        Employee obj = new Employee(1,"siemens");
        obj.printname();
        //System.out.println(obj.id); if we do this here then private mule accessible nahi honar

    }

}