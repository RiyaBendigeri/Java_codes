import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer>nums = Arrays.asList(1,2,3,4,5);
       // Stream<Integer> data = nums.stream();
        Stream<Integer>filtereddata=nums.stream();
        filtereddata.filter(n->n%2==1);
         filtereddata.forEach(n->System.out.println(n));
      //  Stream<Integer>mappeddata=data.map(n->n*2);
        //mappeddata.forEach(n->System.out.println(n));
        
       

    }
}
