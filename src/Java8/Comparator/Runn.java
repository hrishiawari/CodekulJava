package Java8.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by melayer on 1/9/17.
 */
public class Runn {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add(new StudentsRecord(1,"kirloskar"));
        l.add(new StudentsRecord(2,"Kesari"));

        System.out.println("Sorting by Name");

        Collections.sort(l,new NameCompare());
        Iterator itr=l.iterator();
        while (itr.hasNext()){
            StudentsRecord st=(StudentsRecord)itr.next();
            System.out.println(st.RollNo+" "+st.Name);
        }

        System.out.println("sorting by id");

        Collections.sort(l,new SortById());
        Iterator st=l.iterator();
        while (st.hasNext()){
            StudentsRecord pq=(StudentsRecord)st.next();
            System.out.println(pq.RollNo+" "+pq.Name);
        }

    }
}
