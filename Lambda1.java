 interface Hello{
    //void play(int a,int b);
    String play(String a, String b);
 }
public class Lambda1 {
    String instancevar="kohli";
    static String ans="vk";
    public static void main(String[] args) {
        String localname="virat  ";

    Hello obj = (a,b) ->{
        System.out.println(Lambda1.ans);
        System.out.println(obj.instancevar);
        System.out.println(localname);
        return(a+b);
    }
    }
    
}
