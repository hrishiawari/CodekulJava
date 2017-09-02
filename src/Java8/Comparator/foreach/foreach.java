package Java8.Comparator.foreach;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by melayer on 2/9/17.
 */
public class foreach {
    void formap(){
        Map<Integer,String> c=new HashMap<Integer,String>();
        c.put(1,"id1");
        c.put(2,"id2");
        c.put(3,"id3");
        c.put(3,"id4");

        c.forEach((k,v)-> System.out.println(k+"   =  "+v));

    }

    void forlist(){
        List<String> l=new ArrayList<>();
        l.add("well");
        l.add("good");
    l.forEach(i-> System.out.println(i));
    l.forEach(System.out::println);//this is another way of writing lambda functions

    }
    public static void main(String[] args) {
        foreach f=new foreach();
        f.formap();
        f.forlist();
    }


}
