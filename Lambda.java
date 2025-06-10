 interface Hello{
    //void play(int a,int b);
    String play(String a, String b);
 }
// class meth implements Hello{
//    public  void play()
//     {
//         System.out.println("hello i m play");
//     }
// }
public class Lambda {
    public static void main(String[] args) {
        
        Hello obj = (a,b)->{
            System.out.println("i m lambda and my values are "+a+b);
            return(a+b);
        };
        String ans = obj.play("virat","kohli");
        System.out.println(ans);
    }
}
//this is lambda funtion upper
//hello obj = new meth();
//obj.play();