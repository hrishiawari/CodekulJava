package Collections;
import java.util.*;
/**
 * Created by melayer on 30/8/17.
 */
public class Arraylist {
    public void Addall(){
        ArrayList<String> a=new ArrayList<String>();

        a.add("1");
        a.add("q");
        a.add("r");

        ArrayList<String> b=new ArrayList<String>();
        b.add("s");
        b.add("t");
        b.add("u");

        a.addAll(b);

        Iterator z=a.iterator();

        while(z.hasNext()){
            System.out.println(z.next());
        }
    }
    public static void main(String[] args) {


        ArrayList<String> list =new ArrayList<String>();


        list.add("xyz");
        list.add("pqr");
        list.add("xyz");

        Iterator n=list.iterator(); //traversing through iterator
        while (n.hasNext()){
            System.out.println(n.next());
        }

        for(String Obj:list){ // Using For loop;
            System.out.println(Obj);
        }
//        user defined class Objects in ArrayList
        Students s1=new Students(1,"Akshay","Pune");
        Students s2=new Students(2,"rahul","Munbai");
        Students s3=new Students(1,"Akshay","Pune");

        ArrayList<Students> st=new ArrayList<Students>();
        st.add(s1);
        st.add(s2);
        st.add(s3);

        Iterator it=st.iterator();
        while (it.hasNext()) {
            Students s=(Students)it.next();
            System.out.println(s.roll_no+" "+s.name+" "+s.Add);
        }

        Arraylist p=new Arraylist();
        p.Addall();
        p.removeall();
        p.retainall();
    }

    private void removeall() {
        ArrayList<String> rm=new ArrayList<String>();
        rm.add("qw");
        rm.add("qwe");
        rm.add("qwer");
        rm.add("asdasd");

        ArrayList<String> al=new ArrayList<String>();
        al.add("qw");
        al.add("qwe");
        al.add("xyz");

//        rm.addAll(al);
        rm.removeAll(al);//will remove values qw and qwe
        rm.remove("qwer");//will remove only qwer

        Iterator rmv=rm.iterator();
        while (rmv.hasNext()){
            System.out.println(rmv.next());
        }

    }
    public  void retainall(){

        ArrayList<String> rtn=new ArrayList<String>();
        rtn.add("any");
        rtn.add("thing");
        rtn.add("things");

        ArrayList sl=new ArrayList<>();
        sl.add("any");
        sl.add("xy");
        rtn.retainAll(sl);

        Iterator a=rtn.iterator();
        while (a.hasNext()){
            System.out.println(a.next());
        }
    }
}
