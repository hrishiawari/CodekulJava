package Collections.hashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by melayer on 1/9/17.
 */
public class HashExample {
    public static void main(String[] args) {
        HashSet<String> s= new HashSet<>();
        s.add("one");
        s.add("two");
        s.add("one");

        Iterator e=s.iterator();
        while (e.hasNext()){
            System.out.println(e.next());

        }

        int cz=s.size();//return size of set
        System.out.println(cz);

        boolean d =s.contains("one");
        System.out.println(d);

        boolean q=s.isEmpty();
        System.out.println(q);



    }
}
