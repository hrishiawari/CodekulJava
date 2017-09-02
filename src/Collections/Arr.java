package Collections;

import java.util.ArrayList;

class Book {
    int id,quantity;
    String auther,publisher,name;
    public Book(int id, String name,String publisher,String auther,int quantity){
        this.id=id;
        this.auther=auther;
        this.name=name;
        this.publisher=publisher;
        this.quantity=quantity;
    }
}

public class Arr{


    public static void main(String[] args) {
        ArrayList<Book> st=new ArrayList<>();
        Book b1=new Book(1,"qq","qqq","qqq",3);
        Book b2=new Book(1,"qqaa","qss","qqq",4);
        Book bx=new Book(1,"qq","qqsddsq","qqq",3);

        st.add(b1);
        st.add(b2);
        st.add(bx);

        for (Book b: st){
            System.out.println(b.id+" "+b.name+" "+b.publisher+" "+b.auther+" "+b.quantity);
        }


    }




}
