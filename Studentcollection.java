import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;
public class Studentcollection {
    private List<Student>students = new ArrayList<>();
    public List<Student>getStudents()
    {
        return students;
    }
    public void addStudent(Student stud)
    {
        students.add(stud);
    }
    public void display()
    {
        for (Student obj : students) {
            obj.getId();
            obj.getName();
        }
    }
    public Student getStudentbyId(int id)
    {
        for (Student student : students) {
            if(student.sid== id)
            {
                return(student);
            }
           
               
            
        }
         throw new StudentNotFoundException("this student is not found");
    }
    public static void main(String[] args) {
        Studentcollection obj = new Studentcollection();
        Student stud = new Student("kohli", 2);
        obj.addStudent(stud);
        obj.display();
    }
}
