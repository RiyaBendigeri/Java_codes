//import java.util.Collections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.Arrays;


public class Collections {

    public static void main(String[] args) {
            ArrayList<Integer>list = new ArrayList();
            Stack<String>animals = new Stack<>();
            animals.push("a");
            animals.push("b");
            animals.push("c");
            System.out.println(animals.peek());
            Queue<Integer>queue =  new LinkedList<>();//implemneting queue as a Ll
            queue.offer(12);
            queue.offer(23);
            queue.offer(98);
            System.out.println(queue);
            System.out.println(queue.poll());
            animals.pop();
            list.add(5);
            list.add(8);
            list.add(9);
            list.add(81);
            list.add(28);
            //System.out.println(Collections.min(list));
            //System.out.println(Collections.max(list));
            //System.out.println(Collections.frequency(list,9));how many times 9 apears
            //collections.sort(list);
            //collections.sort(list,comparator.reverseOrder())
            System.out.println(list);
            System.out.println(list.get(1));
            list.remove(1);
            System.out.println(list);
           // list.clear();
            list.set(0,100);
            System.out.println(list);
            list.contains(100);
            //if u add it anywhere then baki elements shift hotat 
            //and if u remove it tari
            //diff from array in a way that this is dynamic so apan easily add remove karu shakto
            Iterator<Integer>it= list.iterator();
            while(it.hasNext())
            {
                System.out.println(it.next());
            }
            PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());//all functons same as queue
            pq.offer(12);
            pq.offer(1);
            pq.offer(90);
            System.out.println(pq);//min heap
            ArrayDeque<Integer>adq=new ArrayDeque<>();
            adq.offer(1);
            adq.offer(90);
            adq.offer(45);//adds at last i.e. appends
            adq.offerFirst(800);
            System.out.println(adq);
            System.out.println(adq.peek());
            System.out.println(adq.peekLast());
             System.out.println(adq.pollFirst());//or poll cha ans samech yenar
            System.out.println(adq.pollLast());
            Set<Integer>s=new HashSet<>();//order is not maintained
            s.add(2);
            s.add(1);
            s.add(2);
            System.out.println(s);
            s.isEmpty();
            s.contains(150);
            s.size();
            s.clear();
            s.remove(120);
            Set<Integer>s1 = new LinkedHashSet<>();//this will store in ordered form
            Set<Integer>s2= new TreeSet<>();//this will store in sorted form
            Map<String,Integer>numbers = new HashMap<>();//if it is treemap then the keys will be in sorted order
            numbers.put("one",1);
            numbers.put("two",2);
            System.out.println(numbers);
            if(!numbers.containsKey("thrd"))
            {
                System.out.println("this pair isnt present");
            }
            numbers.putIfAbsent("three",2);
            if(!numbers.containsKey("three"))
            {
                System.out.println("this pair isnt present");
            }
            else{
                System.out.println("it is present");
            }
            ///e.getKey(), e.getValue(), numbers.keySet()
            /// //for (String key:numbers.keySet())
            /// {
            /// sout(key);
            /// }
            /// for (String key:numbers.values())
            /// {
            /// sout(value);
            /// }
            /// if(!numbers.containsKey("two"))
            /// numbers.put("two",23);
            

            Integer [] num = {10,2,6,90,122};
            Arrays.sort(num);
            for(int i:num)
            {   
                System.out.println(i);

            }
            Arrays.binarySearch(num, 1);    
            

     }
}
