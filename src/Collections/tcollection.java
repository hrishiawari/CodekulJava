package Collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by melayer on 1/9/17.
 */
public class tcollection {
    public static void main(String[] args) {
        Students q1 = new Students(1,"www","wsa");
        Students q2 =new Students(2,"sds","wqe");
        Students q3 =new Students(3,"bcxzk","ss");


        ArrayList<Students> a1 = new ArrayList<>();
        a1.add(q1);
        a1.add(q2);
        a1.add(q3);

        Iterator t=a1.iterator();

        while (t.hasNext()){
Students st=(Students)t.next();
            System.out.println(st.roll_no+" "+st.name+" "+st.Add);
        }

        for (Students x:a1){
            System.out.println(x.roll_no);
        }
    }
}
