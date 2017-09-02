package Collections.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by melayer on 1/9/17.
 */
public class SimpleMap {
    public static void main(String[] args) {
        Map<Integer,String> p=new HashMap<Integer,String>();

        p.put(1,"hie");
        p.put(2,"hello");
        System.out.println(p.get(1));

        for (Map.Entry v:p.entrySet()){
            System.out.println(v.getKey()+" "+v.getValue());
        }
    }
}
