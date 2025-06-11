import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
//import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
public class StudentcollectionTest {
    @Test
    public void StudentTests()
    {
        Student stud = new Student("virat", 1);
       
        Studentcollection obj = new Studentcollection();
        obj.addStudent(stud);
        List<Student>result = obj. getStudents();
        boolean actualresult = result.isEmpty();
        obj.display();
       // assertFalse(actualresult);
        //assertTrue("list is not empty", actualresult);
        

    }
    @Test
    public void getStudentbyIdTest()
    {
        Studentcollection obj = new Studentcollection();
        Student stud = new Student("anushka", 2);

        obj.addStudent(stud);
        Student result = obj.getStudentbyId(2);
        //assertNull(result);
        //assertNull(result, "object is not null");
        assertNotNull(result);
    }
    @Test
    public void ExceptionTest()
    {
         Studentcollection obj = new Studentcollection();
        Student stud = new Student("anushka", 2);

        obj.addStudent(stud);
        
       assertThrows(StudentNotFoundException.class, ()->{obj.getStudentbyId(2);} );
    }

}
