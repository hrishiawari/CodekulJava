package Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by melayer on 1/9/17.
 */
public class maps {
    void ListInMap(){
        List<String> n = new ArrayList<>();
        n.add("xyz");
        n.add("pqr");
        List<String> h=new ArrayList<>();
        h.add("hi");
        h.add("hello");
        Map<Integer,List> c=new HashMap<Integer,List>();
        c.put(1,n);
        c.put(2,h);

        System.out.println(c);


        for (List<String> b:c.values()){
            for (String j:b){
                System.out.println(j);
            }
        }

    }
    void MapInList(){
        Map<String,String> np=new HashMap<>();
        np.put("Something","Else");
        np.put("anythong","else");

        Map<String,String> cp=new HashMap<>();
        cp.put("1","one");
        cp.put("2","two");

        List<Map<String,String>> v=new ArrayList<>();
        v.add(np);
        v.add(cp);

        System.out.println(v);

        for (Map<String,String> x:v){
            System.out.println(x);

            for (Map.Entry<String,String> z:x.entrySet()){
                System.out.println(z);
            }

        }

    }

    public static void main(String[] args) {
    maps p=new maps();
    p.ListInMap();
    p.MapInList();
    }
}
