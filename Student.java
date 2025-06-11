public class Student {
    String sname;
    int sid;
    Student(String name, int id)
    {
        this.sname=name;
        this.sid=id;
    }
    int getId()
    {
        return(sid);
    }
    String getName()
    {
        return(sname);
    }
}
