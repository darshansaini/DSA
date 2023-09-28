import java.util.*;
import java.lang.*;


public class LinkedListExample {

    public static void main(String args[]){
        LinkedList<String> ll = new LinkedList<String>();
        
        ll.add("Darshan");
        ll.add("Sanjeev");
        ll.add("Sharda");
        ll.add("Kritika");
        ll.add("Raghav");
        ll.add("Yogesh");

        System.out.println("Whole LinkedList : ");
        System.out.println(ll);

        System.out.println("After Removing Yogesh : ");

        ll.remove("Yogesh");

        System.out.println(ll);

        System.out.println("After removing indexed 5 :");

        ll.remove(3);
        
        System.out.println(ll);

        System.out.println("After removing first : ");
        
        ll.removeFirst();
        
        System.out.println(ll);

        System.out.println("After removing last : ");

        ll.removeLast();

        System.out.println(ll);
    }
    
}
