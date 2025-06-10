public class Exception {
    
    public static void example()throws ArithmeticException{
        int result=36/0;
    }
    public static void read(){
        throw new ArithmeticException("divide by 0");
    }
    public static void main(String[] args) {
        int [] marks = new int[4];
        marks[0]=9;
        marks[1]=8;
        marks[2]=7;
        marks[3]=6;
        try{
            
            try{
                System.out.println(marks[7]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("u r accessing out of bounds");
            }
            read();
        }
        catch(ArithmeticException e)
        {
            System.out.println("error"+e.getMessage());
        }
        catch(NullPointerException e1)
        {
            System.out.println("error"+ e1.getMessage());
        }
        finally{
            System.out.println("i m finally");//executes even if error is present or no
        }
    }
}
