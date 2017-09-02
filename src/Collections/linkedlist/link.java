package Collections.linkedlist;

import Collections.Students;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by melayer on 1/9/17.
 */
class book{
    int id;
    String name,auther;
    public book(int id,String name,String auther){
        this.id=id;
        this.name=name;
        this.auther=auther;
    }
}
public class link {
    public static void main(String[] args) {
        book b=new book(1,"dsa","asd");
        book c=new book(2,"rew","wer");
        book d=new book(3,"d","d");
        List<book> s=new LinkedList<>();
        s.add(b);
        s.add(c);
        s.add(d);

        for (book n:s){
            System.out.println(n.id+" "+n.name+" "+n.auther);
        }
        Iterator<book> t=s.iterator();
        while (t.hasNext()){
            book l=(book)t.next();
            System.out.println(l.id+" "+l.name+" "+l.auther);
        }
    }
}
