
import java.util.*;

public class CustomException{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try{

        
        int age=sc.nextInt();
        if(age<18)
        {
            throw new MyException();
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
}
public class MyException extends Exception{
   
}
