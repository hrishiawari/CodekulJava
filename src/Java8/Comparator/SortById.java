package Java8.Comparator;

import java.util.Collections;
import java.util.Comparator;

/**
 * Created by melayer on 1/9/17.
 */
public class SortById implements Comparator{

    @Override
    public int compare(Object o, Object t1) {
        StudentsRecord st=(StudentsRecord)o;
        StudentsRecord st1=(StudentsRecord)t1;

        if (st.RollNo==st1.RollNo){
            return 0;

        }else if(st.RollNo>st1.RollNo) {
            return 1;
        }   else
            return -1;

    }
}
