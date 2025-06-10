import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Stream1 {
    public static void main(String[] args) {
        List<Integer>nums = Arrays.asList(1,2,3,4,5);
        Stream<Integer> data = nums.stream();
        long count= data.count();
        System.out.println(count);
        Stream<Integer>sorteddata=data.sorted();
        sorteddata.forEach(n->System.out.println(n));
        //data.forEach(n->System.out.println(n));
       // data.forEach(n->System.out.println(n));if u write this u willl get error as u can write in that stream only once
       

    }
    

}
