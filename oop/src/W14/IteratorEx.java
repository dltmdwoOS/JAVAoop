package W14;

import java.util.*;
public class IteratorEx {
    public static void main(String[] args) {
        // create vector for integer
        Vector<Integer> v = new Vector<Integer>();
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2, 100);
        // print all integer using Iterator
        Iterator<Integer> it = v.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        int sum = 0;
        it = v.iterator(); 
        while(it.hasNext()){
            sum += it.next();
        }
        System.out.println("Sum : " + sum);
    }
}