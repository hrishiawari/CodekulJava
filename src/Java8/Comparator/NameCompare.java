package Java8.Comparator;

import java.util.Comparator;

/**
 * Created by melayer on 1/9/17.
 */
public class NameCompare implements Comparator{


    public int compare(Object o, Object t1) {
        StudentsRecord s1=(StudentsRecord)o;
        StudentsRecord s2=(StudentsRecord)t1;
    return s1.Name.compareTo(s2.Name);
    }
}
